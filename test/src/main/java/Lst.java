import java.util.ArrayList;


public class Lst {
	private ArrayList<Place> objects;
	public Lst(){
		objects = new ArrayList<Place>();
	}
	public void add(Place place){
		objects.add(place);
	}

	public void edit (int i, Place place){
		objects.get(i).setRu(place.getRu());
		objects.get(i).setpol(place.getpol());
		objects.get(i).setgrazh(place.getgrazh());
		objects.get(i).setstrahpol(place.getstrahpol());
		objects.get(i).setadrsov(place.getadrsov());
		objects.get(i).setsempol(place.getsempol());
		objects.get(i).setSumKred(place.getSumKred());
		objects.get(i).setSrokKred(place.getSrokKred());
		objects.get(i).setSurnam(place.getSurnam());
		objects.get(i).setNam(place.getNam());
		objects.get(i).setSecondNam(place.getSecondNam());
		objects.get(i).setBirthDat(place.getBirthDat());
		objects.get(i).setSerNu(place.getSerNu());
		objects.get(i).setNu(place.getNu());
		objects.get(i).setPassDat(place.getPassDat());
		objects.get(i).setOrg(place.getOrg());
		objects.get(i).setInd(place.getInd());
		objects.get(i).setCit(place.getCit());
		objects.get(i).setStree(place.getStree());
		objects.get(i).setHous(place.getHous());
		objects.get(i).setCor(place.getCor());
		objects.get(i).setYea(place.getYea());
		objects.get(i).setPhon(place.getPhon());
		objects.get(i).setMobil(place.getMobil());
		objects.get(i).setChildre(place.getChildre());
		objects.get(i).setn18(place.getn18());
		objects.get(i).setPro(place.getPro());
		objects.get(i).setSrokRa(place.getSrokRa());
		objects.get(i).setkukuha(place.getkukuha());
		objects.get(i).setb(place.getb());
		objects.get(i).setrabota(place.getrabota());
		objects.get(i).setAdrrab(place.getAdrrab());
		objects.get(i).setKv(place.getKv());
		objects.get(i).setDom(place.getDom());
		objects.get(i).setAvto(place.getAvto());
		objects.get(i).setBank(place.getBank());
		objects.get(i).setCard(place.getCard());
		objects.get(i).setLmP(place.getLmP());
		objects.get(i).sett1(place.gett1());
		objects.get(i).sett2(place.gett2());
		objects.get(i).sett3(place.gett3());
		objects.get(i).sett4(place.gett4());
		objects.get(i).sett5(place.gett5());
		objects.get(i).sett6(place.gett6());
		objects.get(i).sett7(place.gett7());
		objects.get(i).sett8(place.gett8());
		objects.get(i).sett9(place.gett9());
		objects.get(i).sett10(place.gett10());
		objects.get(i).sett11(place.gett11());
		objects.get(i).sett12(place.gett12());
		objects.get(i).sett13(place.gett13());
		objects.get(i).sett14(place.gett14());
		objects.get(i).sett15(place.gett15());
		objects.get(i).sett16(place.gett16());
		objects.get(i).sett17(place.gett17());
		objects.get(i).sett18(place.gett18());
		objects.get(i).sett19(place.gett19());
		objects.get(i).sett20(place.gett20());
		objects.get(i).sett21(place.gett21());
		objects.get(i).sett22(place.gett22());
		objects.get(i).sett23(place.gett23());
		objects.get(i).sett24(place.gett24());
		
	}
	public void setRu(int i, String Ru) {
		objects.get(i).setRu(Ru);
	}
	public void setpol(int i, String pol) {
		objects.get(i).setpol(pol);
	}
	public void setgrazh(int i, String grazh) {
		objects.get(i).setgrazh(grazh);
	}
	public void setstrahpol(int i, String strahpol) {
		objects.get(i).setstrahpol(strahpol);
	}
	public void setadrsov(int i, String adrsov) {
		objects.get(i).setadrsov(adrsov);
	}
	public void setsempol(int i, String sempol) {
		objects.get(i).setsempol(sempol);
	}
	public void setSumKred(int i, String SumKred) {
		objects.get(i).setSumKred(SumKred);
	}
	public void setSrokKred(int i, String SrokKred) {
		objects.get(i).setSrokKred(SrokKred);
	}
	public void setSurnam(int i, String Surnam) {
		objects.get(i).setSurnam(Surnam);
	}
	public void setNam(int i, String Nam) {
		objects.get(i).setNam(Nam);
	}
	public void setSecondNam(int i, String SecondNam) {
		objects.get(i).setSecondNam(SecondNam);
	}
	public void setBirthDat(int i, String BirthDat) {
		objects.get(i).setBirthDat(BirthDat);
	}
	public void setSerNu(int i, String SerNu) {
		objects.get(i).setSerNu(SerNu);
	}
	public void setNu(int i, String Nu) {
		objects.get(i).setNu(Nu);
	}
	public void setPassDat(int i, String PassDat) {
		objects.get(i).setPassDat(PassDat);
	}
	public void setOrg(int i, String Org) {
		objects.get(i).setOrg(Org);
	}
	public void setInd(int i, String Ind) {
		objects.get(i).setInd(Ind);
	}
	public void setCit(int i, String Cit) {
		objects.get(i).setCit(Cit);
	}
	public void setStree(int i, String Stree) {
		objects.get(i).setStree(Stree);
	}
	public void setHous(int i, String Hous) {
		objects.get(i).setHous(Hous);
	}
	public void setCor(int i, String Cor) {
		objects.get(i).setCor(Cor);
	}
	public void setYea(int i, String Yea) {
		objects.get(i).setYea(Yea);
	}
	public void setPhon(int i, String Phon) {
		objects.get(i).setPhon(Phon);
	}
	public void setMobil(int i, String Mobil) {
		objects.get(i).setMobil(Mobil);
	}
	public void setChildre(int i, String Childre) {
		objects.get(i).setChildre(Childre);
	}
	public void setn18(int i, String n18) {
		objects.get(i).setn18(n18);
	}
	public void setPro(int i, String Pro) {
		objects.get(i).setPro(Pro);
	}
	public void setSrokRa(int i, String SrokRa) {
		objects.get(i).setSrokRa(SrokRa);
	}
	public void setkukuha(int i, String kukuha) {
		objects.get(i).setkukuha(kukuha);
	}
	public void setrabota(int i, String rabota) {
		objects.get(i).setrabota(rabota);
	}
	public void setAdrrab(int i, String Adrrab) {
		objects.get(i).setAdrrab(Adrrab);
	}
	
	
	public void setKv(int i, String kv) {
		objects.get(i).setKv(kv);
	}
	public void setDom(int i, String dom) {
		objects.get(i).setDom(dom);
	}
	public void setAvto(int i, String avto) {
		objects.get(i).setAvto(avto);
	}
	public void setBank(int i, String bank) {
		objects.get(i).setBank(bank);
	}
	public void setCard(int i, String card) {
		objects.get(i).setCard(card);
	}
	public void setLimit(int i, String limit) {
		objects.get(i).setLmP(limit);
	}
	public void sett1(int i, String t1) {
		objects.get(i).sett1(t1);
	}
	public void sett2(int i, String t2) {
		objects.get(i).sett2(t2);
	}
	public void sett3(int i, String t3) {
		objects.get(i).sett3(t3);
	}
	public void sett4(int i, String t4) {
		objects.get(i).sett4(t4);
	}
	public void sett5(int i, String t5) {
		objects.get(i).sett5(t5);
	}
	public void sett6(int i, String t6) {
		objects.get(i).sett6(t6);
	}
	public void sett7(int i, String t7) {
		objects.get(i).sett7(t7);
	}
	public void sett8(int i, String t8) {
		objects.get(i).sett8(t8);
	}
	public void sett9(int i, String t9) {
		objects.get(i).sett9(t9);
	}
	public void sett10(int i, String t10) {
		objects.get(i).sett10(t10);
	}
	public void sett11(int i, String t11) {
		objects.get(i).sett11(t11);
	}
	public void sett12(int i, String t12) {
		objects.get(i).sett12(t12);
	}
	public void sett13(int i, String t13) {
		objects.get(i).sett13(t13);
	}
	public void sett14(int i, String t14) {
		objects.get(i).sett14(t14);
	}
	public void sett15(int i, String t15) {
		objects.get(i).sett15(t15);
	}
	public void sett16(int i, String t16) {
		objects.get(i).sett16(t16);
	}
	public void sett17(int i, String t17) {
		objects.get(i).sett17(t17);
	}
	public void sett18(int i, String t18) {
		objects.get(i).sett18(t18);
	}
	public void sett19(int i, String t19) {
		objects.get(i).sett19(t19);
	}
	public void sett20(int i, String t20) {
		objects.get(i).sett20(t20);
	}
	public void sett21(int i, String t21) {
		objects.get(i).sett21(t21);
	}
	public void sett22(int i, String t22) {
		objects.get(i).sett22(t22);
	}
	public void sett23(int i, String t23) {
		objects.get(i).sett23(t23);
	}
	public void sett24(int i, String t24) {
		objects.get(i).sett24(t24);
	}
	
	public Place getObjectsById(int i){
		return objects.get(i);
	}
	public String getRu(int i){
		return objects.get(i).getRu();
	}
	public String getpol(int i){
		return objects.get(i).getpol();
	}
	public String getgrazh(int i){
		return objects.get(i).getgrazh();
	}
	public String getstrahpol(int i){
		return objects.get(i).getstrahpol();
	}
	public String getadrsov(int i){
		return objects.get(i).getadrsov();
	}
	public String getsempol(int i){
		return objects.get(i).getsempol();
	}
	public String getSumKred(int i){
		return objects.get(i).getSumKred();
	}
	public String getSrokKred(int i){
		return objects.get(i).getSrokKred();
	}
	public String getSurnam(int i){
		return objects.get(i).getSurnam();
	}
	public String getNam(int i){
		return objects.get(i).getNam();
	}
	public String getSecondNam(int i){
		return objects.get(i).getSecondNam();
	}
	public String getBirthDat(int i){
		return objects.get(i).getBirthDat();
	}
	public String getSerNu(int i){
		return objects.get(i).getSerNu();
	}
	public String getNu(int i){
		return objects.get(i).getNu();
	}
	public String getPassDat(int i){
		return objects.get(i).getPassDat();
	}
	public String getOrg(int i){
		return objects.get(i).getOrg();
	}
	public String getInd(int i){
		return objects.get(i).getInd();
	}
	public String getCit(int i){
		return objects.get(i).getCit();
	}
	public String getStree(int i){
		return objects.get(i).getStree();
	}
	public String getHous(int i){
		return objects.get(i).getHous();
	}
	public String getCor(int i){
		return objects.get(i).getCor();
	}
	public String getYea(int i){
		return objects.get(i).getYea();
	}
	public String getPhon(int i){
		return objects.get(i).getPhon();
	}
	public String getMobil(int i){
		return objects.get(i).getMobil();
	}
	public String getChildre(int i){
		return objects.get(i).getChildre();
	}
	public String getn18(int i){
		return objects.get(i).getn18();
	}
	public String getPro(int i){
		return objects.get(i).getPro();
	}
	public String getSrokRa(int i){
		return objects.get(i).getSrokRa();
	}
	public String getkukuha(int i){
		return objects.get(i).getkukuha();
	}
	
	public String getrabota(int i){
		return objects.get(i).getrabota();
	}
	public String getAdrrab(int i){
		return objects.get(i).getAdrrab();
	}
	public String getb(int i){
		return objects.get(i).getb();
	}
	public String getKv(int i){
		return objects.get(i).getKv();
	}
	public String getDom(int i){
		return objects.get(i).getDom();
	}
	public String getAvto(int i){
		return objects.get(i).getAvto();
	}
	public String getBank(int i){
		return objects.get(i).getBank();
	}
	public String getCard(int i){
		return objects.get(i).getCard();
	}
	public String getLimit(int i){
		return objects.get(i).getLmP();
	}
	public String gett1(int i){
		return objects.get(i).gett1();
	}
	public String gett2(int i){
		return objects.get(i).gett2();
	}
	public String gett3(int i){
		return objects.get(i).gett3();
	}
	public String gett4(int i){
		return objects.get(i).gett4();
	}
	public String gett5(int i){
		return objects.get(i).gett5();
	}
	public String gett6(int i){
		return objects.get(i).gett6();
	}
	public String gett7(int i){
		return objects.get(i).gett7();
	}
	public String gett8(int i){
		return objects.get(i).gett8();
	}
	public String gett9(int i){
		return objects.get(i).gett9();
	}
	public String gett10(int i){
		return objects.get(i).gett10();
	}
	public String gett11(int i){
		return objects.get(i).gett11();
	}
	public String gett12(int i){
		return objects.get(i).gett12();
	}
	public String gett13(int i){
		return objects.get(i).gett13();
	}
	public String gett14(int i){
		return objects.get(i).gett14();
	}
	public String gett15(int i){
		return objects.get(i).gett15();
	}
	public String gett16(int i){
		return objects.get(i).gett16();
	}
	public String gett17(int i){
		return objects.get(i).gett17();
	}
	public String gett18(int i){
		return objects.get(i).gett18();
	}
	public String gett19(int i){
		return objects.get(i).gett19();
	}
	public String gett20(int i){
		return objects.get(i).gett20();
	}
	public String gett21(int i){
		return objects.get(i).gett21();
	}
	public String gett22(int i){
		return objects.get(i).gett22();
	}
	public String gett23(int i){
		return objects.get(i).gett23();
	}
	public String gett24(int i){
		return objects.get(i).gett24();
	}
	public int size(){
		return objects.size();
	}
	public void remove(int i){
		objects.remove(i);
	}
	//public void edit(String text, String text2, String text3, String text4, String text5, String text6, String text7,
		//	String text8, String text9, String text10, String text11, String text12, String text13, String text14,
			//String text15, String text16, String text17, String text18, String text19, String text20, String text21,
			//String text22, String text23, String text24, String text25, String text26, String text27, String text28,
			//String text29, String text30, String text31, String text32, String text33, String text34, String text35,
			//String text36, String text37, String text38, String text39, String text40, String text41, String text42,
			//String text43, String text44, String text45, String text46, String text47, String text48, String text49,
			//String text50, String text51, String text52, String text53, String text54, String text55, String text56,
			//String text57, String text58, String text59, String text60, String text61, String text62) {

		
	}