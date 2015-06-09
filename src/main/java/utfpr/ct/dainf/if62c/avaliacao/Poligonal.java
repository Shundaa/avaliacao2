/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utfpr.ct.dainf.if62c.avaliacao;

/**
 *
 * @author yolo
 */
public class Poligonal {
    int num;
    char plan = 'n';
    Ponto2D [] vertices;
    protected Poligonal(int num){
        this.num=num;
        if(num<3){
            throw new RuntimeException("Poligonal deve ter ao menos 2 vértices");
        }
        vertices = new Ponto2D[num];
    }
    public int getN(){
        return num;
    }
    public Ponto2D get(int num){
        if(num>=0&&num<this.num)
            return vertices[num];
        else
            return null;
    }
    public void set(int num,Ponto2D d){
        if(plan =='x'){
            if(d.x!=0){
                throw new RuntimeException("Vértices devem estar no mesmo plano"); 
            }
        }
        else if(plan =='y'){
            if(d.y!=0){
                throw new RuntimeException("Vértices devem estar no mesmo plano"); 
            }
        }
        else if(plan =='z'){
            if(d.z!=0){
                throw new RuntimeException("Vértices devem estar no mesmo plano"); 
            }
        }
        try{
            
        vertices[num]=d;
        }
        catch(Exception e){
            //do NADA
        }
         if(plan=='n')
            if(d.x==0)
                plan='x';
            else  if(d.y==0)
                plan='y';
            else
                plan='z';
    }
    public double getComprimento(){
        double soma=0;
        for(int i=1;i<num;i++){
            soma= Math.sqrt(Math.pow(vertices[i-1].x-vertices[i].x,2)+Math.pow(vertices[i-1].y-vertices[i].y,2)+Math.pow(vertices[i-1].z-vertices[i].z,2))+soma;
        }
        return  soma;
    }  
}
