import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;

@Entity
@Table(name = "zayav")
public class Place {

	@javax.persistence.Id
	@GeneratedValue
	private long Id;

	public long getId() {
		return Id;
	}

	public void setId(long id) {
		Id = id;
	}

	private String pol;
	private String Ru;
	private String grazh;
	private String strahpol;
	private String adrsov;
	private String sempol;
	private String SumKred;
	private String SrokKred;
	private String Surnam;
	private String Nam;
	private String SecondNam;
	private String BirthDat;
	private String BirthPlace;
	private String SerNu;
	private String Nu;
	private String PassDat;
	private String Org;
	private String Ind;
	private String Cit;
	private String Stree;
	private String Hous;
	private String Cor;
	private String Yea;
	private String Phon;
	private String Mobil;
	private String Childre;
	private String n18;
	private String Pro;
	private String SrokRa;
	private String kukuha;
	private String rabota;
	private String Adrrab;
	private String kv;
	private String dom;
	private String avto;
	private String bank;
	private String card;
	private String limit;
    private String t1;
    private String t2;
    private String t3;
	private String t4;
    private String t5;
	private String t6;
	private String t7;
	private String t8;
	private String t9;
	private String t10;
	private String t11;
	private String t12;
    private String t13;
    private String t14;
	private String t15;
	private String t16;
    private String t17;
	private String t18;
	private String t19;
	private String t20;
	private String t21;
	private String t22;
	private String t23;
	private String t24;



	Place(String Ru, String pol, String grazh, String strahpol, String adrsov, String sempol, String SumKred, String SrokKred, String Surnam, String Nam,
		  String SecondNam, String BirthDat, String BirthPlace, String SerNu, String Nu, String PassDat, String Org, String Ind, String Cit, String Stree,
		  String Hous, String Cor, String Yea, String Phon, String Mobil, String Childre, String n18, String Pro, String SrokRa, String kukuha,
		  String rabota, String Adrrab, String kv, String dom, String avto, String bank, String card, String limit, String t1, String t2, String t3, String t4,
		  String t5, String t6, String t7, String t8, String t9, String t10, String t11, String t12, String t13, String t14, String t15, String t16,
		  String t17, String t18, String t19, String t20, String t21, String t22, String t23, String t24){
		
		this.setRu(Ru);
		this.setpol(pol);
		this.setgrazh(grazh);
		this.setstrahpol(strahpol);
		this.setadrsov(adrsov);
		this.setsempol(sempol);
		this.setSumKred(SumKred);
		this.setSrokKred(SrokKred);
		this.setSurnam(Surnam);
		this.setNam(Nam);
		this.setSecondNam(SecondNam);
		this.setBirthDat(BirthDat);
		this.setSerNu(SerNu);
		this.setNu(Nu);
		this.setPassDat(PassDat);
		this.setOrg(Org);
		this.setInd(Ind);
		this.setCit(Cit);
		this.setStree(Stree);
		this.setHous(Hous);
		this.setCor(Cor);
		this.setYea(Yea);
		this.setPhon(Phon);
		this.setMobil(Mobil);
		this.setChildre(Childre);
		this.setn18(n18);
		this.setPro(Pro);
		this.setSrokRa(SrokRa);
		this.setkukuha(kukuha);
		this.setrabota(rabota);
		this.setAdrrab(Adrrab);
		this.setKv(kv);
		this.setDom(dom);
		this.setAvto(avto);
		this.setBank(bank);
		this.setCard(card);
		this.setLimit(limit);
		this.sett1(t1);
		this.sett2(t2);
		this.sett3(t3);
		this.sett4(t4);
		this.sett5(t5);
		this.sett6(t6);
		this.sett7(t7);
		this.sett8(t8);
		this.sett9(t9);
		this.sett10(t10);
		this.sett11(t11);
		this.sett12(t12);
		this.sett13(t13);
		this.sett14(t14);
		this.sett15(t15);
		this.sett16(t16);
		this.sett17(t17);
		this.sett18(t18);
		this.sett19(t19);
		this.sett20(t20);
		this.sett21(t21);
		this.sett22(t22);
		this.sett23(t23);
		this.sett24(t24);
		this.setb(BirthPlace);
	}
	public String getRu() {
		return Ru;
	}
	public void setRu(String Ru) {
		this.Ru = Ru;
	}
	public String getb() {
		return BirthPlace;
	}
	public void setb(String BirthPlac) {
		this.BirthPlace = BirthPlac;
	}
	public String getpol() {
		return pol;
	}
	public void setpol(String pol) {
		this.pol = pol;
	}
	public String getgrazh() {
		return grazh;
	}
	public void setgrazh(String grazh) {
		this.grazh = grazh;
	}
	public String getstrahpol() {
		return strahpol;
	}
	public void setstrahpol(String strahpol) {
		this.strahpol = strahpol;
	}
	public String getadrsov() {
		return adrsov;
	}
	public void setadrsov(String adrsov) {
		this.adrsov = adrsov;
	}
	public String getsempol() {
		return sempol;
	}
	public void setsempol(String sempol) {
		this.sempol = sempol;
	}
	public String getSumKred() {
		return SumKred;
	}
	public void setSumKred(String SumKred) {
		this.SumKred = SumKred;
	}
	public String getSrokKred() {
		return SrokKred;
	}
	public void setSrokKred(String SrokKred) {
		this.SrokKred = SrokKred;
	}
	public String getSurnam() {
		return Surnam;
	}
	public void setSurnam(String Surnam) {
		this.Surnam = Surnam;
	}
	public String getNam() {
		return Nam;
	}
	public void setNam(String Nam) {
		this.Nam = Nam;
	}
	public String getSecondNam() {
		return SecondNam;
	}
	public void setSecondNam(String SecondNam) {
		this.SecondNam = SecondNam;
	}
	public String getBirthDat() {
		return BirthDat;
	}
	public void setBirthDat(String BirthDat) {
		this.BirthDat = BirthDat;
	}
	public String getSerNu() {
		return SerNu;
	}
	public void setSerNu(String SerNu) {
		this.SerNu = SerNu;
	}
	public String getNu() {
		return Nu;
	}
	public void setNu(String Nu) {
		this.Nu = Nu;
	}
	public String getPassDat() {
		return PassDat;
	}
	public void setPassDat(String PassDat) {
		this.PassDat = PassDat;
	}
	public String getOrg() {
		return Org;
	}
	public void setOrg(String Org) {
		this.Org = Org;
	}
	public String getInd() {
		return Ind;
	}
	public void setInd(String Ind) {
		this.Ind = Ind;
	}
	public String getCit() {
		return Cit;
	}
	public void setCit(String Cit) {
		this.Cit = Cit;
	}
	public String getStree() {
		return Stree;
	}
	public void setStree(String Stree) {
		this.Stree = Stree;
	}
	public String getHous() {
		return Hous;
	}
	public void setHous(String Hous) {
		this.Hous = Hous;
	}
	public String getCor() {
		return Cor;
	}
	public void setCor(String Cor) {
		this.Cor = Cor;
	}
	public String getYea() {
		return Yea;
	}
	public void setYea(String Yea) {
		this.Yea = Yea;
	}
	public String getPhon() {
		return Phon;
	}
	public void setPhon(String Phon) {
		this.Phon = Phon;
	}
	public String getMobil() {
		return Mobil;
	}
	public void setMobil(String Mobil) {
		this.Mobil = Mobil;
	}
	public String getChildre() {
		return Childre;
	}
	public void setChildre(String Childre) {
		this.Childre = Childre;
	}
	public String getn18() {
		return n18;
	}
	public void setn18(String n18) {
		this.n18 = n18;
	}
	public String getPro() {
		return Pro;
	}
	public void setPro(String Pro) {
		this.Pro = Pro;
	}
	public String getSrokRa() {
		return SrokRa;
	}
	public void setSrokRa(String SrokRa) {
		this.SrokRa = SrokRa;
	}
	public String getkukuha() {
		return kukuha;
	}
	public void setkukuha(String kukuha) {
		this.kukuha = kukuha;
	}
	public String getrabota() {
		return rabota;
	}
	public void setrabota(String rabota) {
		this.rabota = rabota;                              
	}
	public String getAdrrab() {
		return Adrrab;
	}
	public void setAdrrab(String Adrrab) {
		this.Adrrab = Adrrab;
	}
	public String gett1() {
		return t1;
	}
	public void sett1(String t1) {
		this.t1 = t1;
	}
	public String gett2() {
		return t2;
	}
	public void sett2(String t2) {
		this.t2 = t2;
	}
	public String gett3() {
		return t3;
	}
	public void sett3(String t3) {
		this.t3 = t3;
	}
	public String gett4() {
		return t4;
	}
	public void sett4(String t4) {
		this.t4 = t4;
	}
	public String gett5() {
		return t5;
	}
	public void sett5(String t5) {
		this.t5 = t5;
	}
	public String gett6() {
		return t6;
	}
	public void sett6(String t6) {
		this.t6 = t6;
	}
	
	public String gett7() {
		return t7;
	}
	public void sett7(String t7) {
		this.t7 = t7;
	}
	public String gett8() {
		return t8;
	}
	public void sett8(String t8) {
		this.t8 = t8;
	}
	public String gett9() {
		return t9;
	}
	public void sett9(String t9) {
		this.t9 = t9;
	}
	public String gett10() {
		return t10;
	}
	public void sett10(String t10) {
		this.t10 = t10;
	}
	public String gett11() {
		return t11;
	}
	public void sett11(String t11) {
		this.t11 = t11;
	}
	public String gett12() {
		return t12;
	}
	public void sett12(String t12) {
		this.t12 = t12;
		
	}	public String gett13() {
		return t13;
	}
	public void sett13(String t13) {
		this.t13 = t13;
	}
	public String gett14() {
		return t14;
	}
	public void sett14(String t14) {
		this.t14 = t14;
	}
	public String gett15() {
		return t15;
	}
	public void sett15(String t15) {
		this.t15 = t15;
	}
	public String gett16() {
		return t16;
	}
	public void sett16(String t16) {
		this.t16 = t16;
	}
	public String gett17() {
		return t17;
	}
	public void sett17(String t17) {
		this.t17 = t17;
	}
	public String gett18() {
		return t18;
	}
	public void sett18(String t18) {
		this.t18 = t18;
	}	
	public String gett19() {
		return t19;
	}
	public void sett19(String t19) {
		this.t19 = t19;
	}
	public String gett20() {
		return t20;
	}
	public void sett20(String t20) {
		this.t20 = t20;
	}
	public String gett21() {
		return t21;
	}
	public void sett21(String t21) {
		this.t21 = t21;
	}
	public String gett22() {
		return t22;
	}
	public void sett22(String t22) {
		this.t22 = t22;
	}
	public String gett23() {
		return t23;
	}
	public void sett23(String t23) {
		this.t23 = t23;
	}
	public String gett24() {
		return t24;
	}
	public void sett24(String t24) {
		this.t24 = t24;
	}	
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	public String getKv() {
		return kv;
	}
	public void setKv(String kv) {
		this.kv = kv;
	}
	public String getDom() {
		return dom;
	}
	public void setDom(String dom) {
		this.dom = dom;
	}
	public String getAvto() {
		return avto;
	}
	public void setAvto(String avto) {
		this.avto = avto;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getLimit() {
		return limit;
	}
	public void setLimit(String limit) {
		this.limit = limit;
	}
	public ArrayList<Place> objects = new ArrayList<Place>();
}
