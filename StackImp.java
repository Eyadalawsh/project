/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package applacation;

import java.util.Stack;

/**
 *
 * @author User
 */
public class StackImp {
     public String infixToPostfix(String s){
        Stack<Character> st=new Stack<Character>();
        String postfix="";
        char ch[] =s.toCharArray();
        for(char c:ch){
            if(c !='+' && c !='-' && c !='*' && c !='/' && c !='{' && c !='}'){
                postfix=postfix+c;
        
                                                                                                                }else if(c =='{'){
                
            }else if(c =='{'){
                st.push(c);
            }else if(c=='}'){
            
                while (!st.isEmpty()) {
                    char t=st.pop();
                    if(t !='{'){
                        postfix=postfix+t;
                        
                    }else{break;}
                }
                        }else if(c=='+' ||c=='-'||c=='*'||c=='/'){
                            if(st.isEmpty()){
                                st.push(c);
                            }else{
                                while (!st.isEmpty()) {                                    
                                    char t=st.pop();
                                    if(t=='{'){
                                        st.push(t);
                                        break;
                                    }else if(t=='+' || t=='-'|| t=='*'|| t =='/'){
                                    if(getPriority(t)<= getPriority(c)){
                                        st.push(t);
                                        break;
                                    }else{
                                        postfix=postfix+t;
                                    }
                                    }
                                }
                                st.push(c);
                        }
                        }}
        while (!st.isEmpty()) {
            postfix=postfix+st.pop();
            
        }
        return postfix;
    
    }
    public int getPriority(char c){
        if(c=='+' ||c=='-'){
            return 1;
        }else{
            return 2;
        }
    }
    public int postfixToEvaluation(String a){
        Stack<Integer> st=new Stack<Integer>();
        int x=0,y=0;
        char ch[]=a.toCharArray();
        for(char c:ch){
            if(c>='0' && c<='9'){
                st.push((int) (c - '0'));
            }else{
                y=st.pop();
                x=st.pop();
                switch(c){
                    case '+':
                    st.push(x+y);
                    break;
                    case '-':
                    st.push(x-y);
                    break;
                    case '*':
                        st.push(x*y);
                        break;
                        case '/':
                            st.push(x/y);
                            break;
                    
                }
            }
        }
        return st.pop();
    
}} 