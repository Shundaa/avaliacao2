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
public class PontoXZ extends Ponto2D{
    public PontoXZ(double x,double z){
        this.x=x;
        this.y=0;
        this.z=z;
    }
    @Override
    public String toString(){
        return String.format("%s(%f,%f)",this.getNome(),x,z);
    }
    @Override
    public double getX() {
        return x;
    }
@Override
    public void setX(double x) {
        this.x = x;
    }
@Override
    public double getY() {
        return y;
    }
@Override
    public void setY(double y) {
        this.y = y;
    }
@Override
    public double getZ() {
        return z;
    }
@Override
    public void setZ(double z) {
        this.z = z;
    }

    
}
