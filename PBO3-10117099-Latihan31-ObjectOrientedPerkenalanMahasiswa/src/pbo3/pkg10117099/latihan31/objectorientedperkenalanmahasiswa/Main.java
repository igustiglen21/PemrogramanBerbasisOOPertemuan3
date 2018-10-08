/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117099.latihan31.objectorientedperkenalanmahasiswa;

/**
 *
 * @author I Gusti Glen
//NAMA  :I Gusti Glen
//NIM   :10117099    
//KELAS :IF-3
 */
public class Main {
    public static void main(String[] args) {

        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.setNim("10117099");
        mhs1.setNama("I Gusti Glen");
        mhs1.perkenalkanDiri();

        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.setNim("10110270");
        mhs2.setNama("Indra Taulani");
        mhs2.perkenalkanDiri();

        Mahasiswa mhs3 = new Mahasiswa();
        mhs3.setNim("10116092");
        mhs3.setNama("Evan Dwi Pradipta");
        mhs3.perkenalkanDiri();

        Mahasiswa mhs4 = new Mahasiswa();
        mhs4.setNim("10110382");
        mhs4.setNama("Aldi Senda");
        mhs4.perkenalkanDiri();
    }   
}
