public class BusquedaLinealScrabble{
	public static void main(String[] args)
	{
		String[] a = {"ABA","ABC","ACÁ","ACHÍ","ACHÚ","AES","AGÁ","AHE","AHÍ","AHÓ","AJA","AJE","AJÍ","AJO","ALA","ALE","ALI","ALLÁ","ALLÍ","AMA","AME","AMI","AMO","ANA","ANO","AÑA","AÑO","APA","API","ARA","ARE","ARO","ARRA","ARRE","ASA","ASE","ASI","ASO","ATA","ATE","ATO","AUN","AVE","AVO","AYA","AYO","AZO","BAH","BAO","BAR","BEL","BEN","BES","BEY","BIO","BIS","BIT","BLA","BLE","BOA","BOJ","BOL","BON","BOU","BOX","BOY","BUA","BUE","BUM","BUS","BUZ","CAE","CAÍ","CAL","CAN","CAO","CAP","CAR","CAS","CAY","CAZ","CEA","CEO","CES","CIA","CID","CIE","CIO","CLO","COA","COL","CON","COR","COY","COZ","CUI","CUS","CUY","CUZ","CHAI","CHAL","CHAN","CHAO","CHAS","CHAT","CHAU","CHEF","CHES","CHÍA","CHIC","CHÍE","CHIÍ","CHIN","CHÍO","CHIP","CHIS","CHOP","CHOZ","CHÚA","CHUJ","CHUS","CHUT","CHUZ","DAD","DAN","DAR","DAS","DEA","DEL","DEN","DES","DEY","DIA","DIJ","DIN","DIO","DIU","DIX","DOM","DON","DOS","DOY","DUA","DÚO","DUX","DUZ","ECO","ECU","ECHA","ECHE","ECHO","EES","EFE","EGO","EJE","ELE","ELLA","ELLE","ELLO","EME","EMU","ENE","EÑE","EON","EPA","EPO","ERA","ERE","ERG","ERO","ERRA","ERRE","ERRO","ESA","ESE","ESO","ETA","EVO","FAI","FAN","FAR","FAS","FAX","FAZ","FEA","FEO","FER","FES","FEZ","FÍA","FÍE","FIL","FIN","FÍO","FIS","FON","FUA","FUE","FUI","FUL","FULL","GAG","GAL","GAP","GAS","GAY","GEA","GEL","GEN","GEO","GES","GIL","GIN","GIS","GOL","GRO","GUA","HALL","HAN","HAO","HAS","HAY","HAZ","HER","HEZ","HIN","HOY","HOZ","HUÍ","HUM","HUY","IBA","ICHO","ICHU","ICE","IDA","IDO","ÍES","ION","IRA","IRE","ISA","IZA","IZO","JAI","JAN","JAU","JEA","JET","JIS","JUR","LAR","LAS","LAY","LEA","LED","LEE","LEI","LEN","LEO","LES","LEV","LEY","LÍA","LID","LÍE","LÍO","LIS","LOA","LOE","LOO","LOS","LUA","LÚE","LUI","LUX","LUZ","LLAR","LLES","MACH","MAL","MAM","MAN","MAR","MAS","MEA","MEE","MEO","MES","MÍA","MIE","MIL","MÍO","MIR","MIS","MIZ","MOA","MOD","MOL","MOR","MUA","MUE","MUÍ","MUR","MUS","MUY","NAO","NAS","NEA","NEN","NEO","NÍA","NIN","NIS","NON","NOS","ÑAS","ÑOR","ÑOS","ÑUS","OAS","OBO","OCA","OCHO","ODA","OES","OFF","OHM","OIA","OID","OIL","OIR","OIS","OJO","OLA","OLE","OLI","OLLA","ONA","OPA","OPE","OPO","ORA","ORE","ORI","ORO","OSA","OSE","OSO","OTO","OVA","OVE","OVO","OXE","OYE","OYO","PAF","PAL","PAN","PAO","PAR","PAZ","PCHE","PCHS","PEA","PECH","PEE","PEI","PEO","PES","PEZ","PIA","PIE","PIN","PIO","PIS","PLE","POA","POCH","POM","PON","POP","POR","POS","PRE","PRO","PSI","PÚA","PUB","PUE","PUF","PUM","PUN","PUO","PUS","PUT","QUE","QUI","RAD","RAE","RAI","RAP","RAS","REA","RED","REI","REO","RES","REY","RÍA","RÍE","RIN","RÍO","ROA","ROB","ROE","ROÍ","ROL","RON","ROO","ROS","RUA","RUC","RUE","RUN","RUO","RUS","SAH","SAL","SAN","SAO","SAZ","SEA","SED","SEL","SEN","SEO","SER","SES","SET","SIC","SIJ","SIL","SIN","SIS","SIU","SOL","SON","SOR","SOS","SOY","SPA","SUD","SUR","SUS","TAC","TAL","TAN","TAO","TAS","TAU","TAZ","TEA","TELL","TEN","TER","TES","TEX","TEZ","TÍA","TIC","TÍO","TOA","TOE","TOL","TON","TOO","TOP","TOS","TUL","TUN","TUP","TUS","UBE","UBI","UCE","UCHÚ","UCI","UES","UFA","UFO","UJÚ","UNA","UNE","UNÍ","UNO","UÑA","UÑE","UÑÍ","UÑO","UPA","UPE","UPO","URA","URO","USA","USE","USO","UTA","UVA","UVE","UVI","UZO","VAL","VAN","VAS","VEA","VED","VEN","VEO","VER","VES","VEZ","VÍA","VID","VIL","VIO","VIP","VIS","VOS","VOY","VOZ","XIS","YAL","YAZ","YEN","YES","YIN","YIP","YOD","YOS","ZAR","ZAS","ZEN","ZIS","ZOO","ZUA","ZUM"};

		buscarLineal(a,"AJA");
		buscarLineal(a,"ABC");
		buscarLineal(a,"DFL");
		buscarLineal(a,"ACA");

	}
	public static int buscarLineal(String[] a, String palabra){
		int i = 0;
		while(i < a.length){
			if(a[i].equals(palabra)){
			System.out.printf("La palabra %s si existe y está en la posición %d\n",palabra,i);
				return i;
			}
			i+=1;
		}
		if(i==a.length){
		System.out.printf("La palabra %s no se encuentra en la lista\n", palabra);
		}
		return -1;
	}
}

/*
Notas :)
public static int buscarLineal(String[] arreglo, String palabra){
		for(int i = 0; i<arreglo.length ;i++){

			if(arreglo[i].equals(palabra)){
			System.out.printf("La palabra %s si existe y está en la posición %d",palabra,i);
			return i;
			}
			else
			return -1;
		}
*/
