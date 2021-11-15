/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.*;
/**
 *
 * @author SAFIRA AYU
 */
public class Mahasiswa implements Serializable{

     private String nim;
    private String nama;
    private String jurusan;
    private String programStudi;
    private String ipk;

//    public Mahasiswa(String nim, String nama, String jurusan, String programStudi, String ipk) {
//        this.nim = nim;
//        this.nama = nama;
//        this.jurusan = jurusan;
//        this.programStudi = programStudi;
//        this.ipk = ipk;
//    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setProgramStudi(String programStudi) {
        this.programStudi = programStudi;
    }

    public String getProgramStudi() {
        return programStudi;
    }

    public void setIpk(String ipk) {
        this.ipk = ipk;
    }

    public String getIpk() {
        return ipk;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "nim=" + nim + ", nama=" + nama + ", jurusan=" + jurusan + ", program studi=" + programStudi + ", ipk=" + ipk + '}';
    }

}
