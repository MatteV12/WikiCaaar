package best.myapplication;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


public class MarcheFragment extends Fragment {
    public interface prova{}
    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    ArrayList<ArrayList<String>> auto;

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    private OnFragmentInteractionListener mListener;

    public MarcheFragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static MarcheFragment newInstance(String param1, String param2) {
        MarcheFragment fragment = new MarcheFragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_automarchefragment, container, false);
        final ListView listview = (ListView) view.findViewById(R.id.listview);

        Bundle bundle = new Bundle();
        bundle = this.getArguments();
        String veicolo = bundle.getString("veicoli");
        ArrayList<String> marche;
        ListAdapter adapter;
        switch (veicolo){
            case "auto":
                auto=new ArrayList<ArrayList<String>>();
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.get(0).add("Fiat");
                auto.get(0).add("500");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Ha un aspetto unico e intramontabile, che l'aggiornamento di luglio 2015 (nuovi paraurti, fanali leggermente modificati) ha reso ancora più ricercato. L'interno rétro e con rivestimenti sfiziosi è adatto per quattro persone, anche se chi siede dietro non ha molta aria sopra la testa. Accettabile la capienza del baule. Sempre a luglio 2015 è stato introdotto un moderno impianto multimediale con schermo di 5\" al centro della plancia: può essere integrato di radio digitale, navigatore e \"app\" dedicate, ma è privo di lettore cd. Nella guida l'auto è intuitiva, poco affaticante (cambio e sterzo sono leggeri da azionare) e, con i bicilindrici TwinAir (85 e 105 CV) e il 1.3 turbodiesel (95 CV), anche briosa. Il 1.2 a benzina (69 CV) è un po' fiacco ed è proposto anche a Gpl.\n" +
                        " \n <br /> <br />" +
                        "<img src='cinquecento'>"+
                        "</body>" +
                        "</html>");
                auto.get(0).add("Punto");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "La Fiat Punto ha preso il posto della Punto Evo, ma deriva direttamente dalla Grande Punto del 2005. Gli anni si sentono e certamente nessuno si gira più a guardarla per la strada, ma resta un'utilitaria equilibrata ed elegante. L'abitacolo è abbastanza spazioso (quattro adulti viaggiano senza problemi) e di facile accesso. Comoda anche la posizione di guida, e adeguate alla categoria le finiture; se alcune plastiche sono “economiche”, la plancia è piuttosto curata, con lo sportiveggiante cruscotto a quattro strumenti tondi, la fascia orizzontale morbida e l’ampio schermo della radio con finitura nera lucida. La Fiat Punto ha una capacità del baule discreta per la categoria, mentre l’accessibilità è scomoda: la soglia è piuttosto alta. Non delle migliori anche la visibilità posteriore, che rende meno facili le manovre in “retro”. Nel complesso, comunque, la Fiat Punto è una valida “tuttofare”, maneggevole e sicura: tutte le versioni hanno un comportamento prevedibile, una valida tenuta di strada e freni potenti (fin troppo: occorre abituarsi al pedale parecchio sensibile). Le prestazioni sono tranquille con i motori 1.2 a benzina e 1.4 a metano o a Gpl (che sono fatti apposta per andare a gas e, quindi, non danno problemi di affidabilità). Nettamente più brillanti le diesel con il 1.3 da 95 cavalli. \n"+
                        " \n <br /> <br />" +
                        "<img src='punto2'>"+
                        "</body>"+
                        "</html>");
                auto.get(0).add("Panda");
                auto.get(0).add("<html>" +
                        "<head>" +
                                "</head>" +
                                "<body>" +
                                "Ha una linea originale, da piccola multispazio, con volumi squadrati e profili tondeggianti che le danno un aspetto “muscoloso”; utili i profili in gomma che proteggono la vernice dai piccoli urti. I motivi quadrangolari contraddistinguono anche elementi dell’abitacolo della Fiat Panda, come la strumentazione, il “cuscino” al centro del volante o la grande tasca che si apre nella parte destra della plancia (in plastica rigida, ma discretamente rifinita). Niente male lo spazio a bordo, adeguato a quattro adulti; se si vuole il quinto posto, però, bisogna pagarlo a parte; stesso discorso per il divano scorrevole di 16 cm, che permette di privilegiare lo spazio per le gambe di chi sta dietro o per i bagagli (modulando il volume del baule fra i 225 e i 260 litri). Nata per la città e piuttosto agile grazie alla lunghezza di appena 365 cm, è a suo agio anche nei percorsi extraurbani e vanta una discreta vivacità persino col motore d’accesso alla gamma, il 1.2 a benzina da 69 CV. Spendendo di più ci sono il bicilindrico 0.9 TwinAir Turbo da 85 CV, che promette un favorevole rapporto fra consumi e prestazioni, oppure il diesel 1.3 Multijet da 95 CV. Non mancano le versioni bi-fuel a benzina e a Gpl (la 1.2 EasyPower da 69 CV), e la 0.9 Natural Power a benzina e a metano da 80 CV. Migliorabile la dotazione della Fiat Panda: Esp e airbag laterali anteriori sono optional per tutte; nella “base” Pop (non disponibile con il TwinAir) si pagano a parte anche i poggiatesta posteriori e la radio, di serie a partire dall’allestimento intermedio Easy, mentre per avere il “clima” ci si deve rivolgere al top di gamma Lounge. La versione Trekking, con allestimento quasi fuoristradistico, è disponibile per tutte le alimentazioni salvo che per quella a benzina e a Gpl. \n"+
                                " \n <br /> <br />" +
                                "<img src='panda'>"+
                                "</body>" +
                                "</html>");
                auto.get(1).add("Volvo");
                auto.get(1).add("XC90");
                auto.get(1).add("<html>" +
                        "<head>" +
                                "</head>" +
                                "<body>" +
                                "Maggiormente slanciata del vecchio modello (che ha rimpiazzato dopo 12 anni), la Volvo XC90 è una suv di dimensioni imponenti. Lo stile può essere più elegante o più sportivo a seconda degli allestimenti, differenziati anche da piccoli dettagli estetici (soprattutto nel frontale) e dai cerchi (maggiorati a 20” nel caso della Inscription e della R-Design, con l’opzione di avere quelli di 21” e di 22”). Lussuoso l’abitacolo, ricco di soluzioni all’ultimo grido come il cruscotto costituito da un pannello digitale o l’ampio schermo tattile nella plancia dal quale si controllano anche i servizi di bordo; a richiesta, c’è pure l’head-up display. Adeguati alle dimensioni esterne sia l’abitabilità, sia la capacità del bagagliaio (di 705 litri qualora non siano presenti i due sedili in terza fila, che portano a 7 i posti totali). È da ammiraglia anche il comfort, soprattutto con le sospensioni pneumatiche (optional, e non disponibili per la “base” Kinetic), che migliorano anche la guidabilità. I motori, tutti 2.0 a quattro cilindri, a fronte della cubatura relativamente bassa hanno prestazioni elevate: grazie alla doppia sovralimentazione (turbo più compressore volumetrico) quello a benzina della T6 eroga ben 320 CV. La stessa unità è utilizzata dalla ibrida plug-in T8 Twin Engine, in combinazione con un motore elettrico da 80 CV collegato alle ruote posteriori e in grado di muovere autonomamente la Volvo XC90 per circa 40 km (sfruttando l’energia delle batterie al litio ricaricabili anche da una normale presa elettrica). Ci sono poi le turbodiesel, D4 con 190 CV e D5 biturbo con 235, che come le altre hanno il cambio automatico a 8 marce.\n" +
                        "  \n"+
                                " \n <br /> <br />" +
                                "<img src='xc90'>"+
                                "</body>" +
                                "</html>");
                auto.get(1).add("V40");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "La Volvo V40 ha rimpiazzato in un sol colpo la coupé C30 – della quale ripropone la grinta – e la famigliare V50. Si tratta di una berlina compatta (lunga 437 cm) che offre adeguata abitabilità per quattro adulti; i 335 litri di capacità del bagagliaio, invece, sono un po’ sotto la media delle rivali di dimensioni simili. Il cofano basso e pronunciato contrapposto all’alta coda dà un piacevole dinamismo alla linea, mentre lo stile degli interni è semplice e rigoroso; notevole – fatto salvo qualche dettaglio – il livello dei materiali e delle finiture. Maneggevole e sicura, la Volvo V40 offre elevato piacere di guida anche fra le curve, ma senza sacrificare il comfort. I motori sono tutti 4 cilindri turbo a iniezione diretta, appartenenti alla stessa famiglia e di progettazione recente. A benzina, sono declinati nelle varianti da 122, 152, 190 e 245 CV, a gasolio da 120, 150 o 190 CV. La cilindrata è di 2 litri (1969 cm3 per esser precisi) per tutte le motorizzazioni diesel, per quelle a benzina di maggiore potenza (190 e 145 CV) e per quelle a benzina da 122 o 152 CV (chiamate rispettivamente T2 e T3) abbinate a un cambio meccanico. Il motore delle T2 e T3 equipaggiate con cambio automatico Geartronic, invece, hanno una cilindrata di 1,5 litri, grazie alla riduzione della corsa dei pistoni da 93,2 a 70,9 mm, mantenendo inalterati i valori di potenza e di coppia massima: quest'ultima è però disponibile a partire da un regime di circa 500 giri più alto rispetto ai duemila. Progettata con grande attenzione per la sicurezza, la Volvo V40 è il primo modello di serie a utilizzare un airbag esterno (posto alla base del parabrezza) destinato a proteggere i pedoni in caso d’investimento, e può essere arricchita con sofisticati dispositivi di assistenza alla guida quali il sistema “antitamponamento” che individua gli ostacoli e frena automaticamente al di sotto dei 50 km/h, il cruise control con radar di distanza o il supporto di riconoscimento dei segnali stradali e di mantenimento della corsia di marcia. \n"+
                        " \n <br /> <br />" +
                        "<img src='v40'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("V60");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Rinnovata nel frontale a marzo 2015, l’originale, grintosa e filante Volvo V60 offre una discreta abitabilità a quattro adulti (mentre in tre, sul divano, si sta strettini). Con i suoi 463 cm di lunghezza è un centimetro più corta della berlina S60, ma gode di un bagagliaio, seppure non enorme, decisamente ben sfruttabile. Peccato che alcune plastiche impiegate negli interni siano troppo economiche, e non manchi qualche dettaglio migliorabile. Forte di sospensioni che mettono d’accordo le esigenze del comfort con quelle della guidabilità, la Volvo V60 permette di scegliere fra numerosi motori, tutti tubo ed Euro 6 (salvo i D2 meno potenti): quelli a benzina partono dal 2.0 da 152 CV della T3 o 190 CV per la T4) e, passando per la 2.0 T5 da 245 CV, arrivano alla “rabbiosa” T6 AW, sempre 2.0, con ben 306 CV. A gasolio ci sono le D2 1.6 da 114 CV, oppure 2.0 da 120; poi, sempre col 2.0, ci sono le D3 da 150 CV, le D4 da 190 e le D5 da 225. Con la trazione 4x4 si può avere la D4, con un 2.4 a cinque cilindri da 190 CV. Basata sullo stesso motore, affiancato a un’unità elettrica (e corredata della trazione integrale) anche la ibrida Plug-in, che vanta una potenza combinata di 288 CV. Al City Safety, che evita i tamponamenti a bassa velocità ed è di serie in tutta la gamma, chi ha a cuore la sicurezza può aggiungere il Driver Support (optional): include sofisticati dispositivi fra cui il Pedestrian Detection, che evita l’investimento di pedoni o, nella peggiore delle ipotesi, riduce la velocità d’impatto.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='v60'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Mercedes");
                auto.get(2).add("Classe A");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Sono bastati pochi leggeri ritocchi ai fari (anche full led), ai paraurti, ancora più sportivi, ai fanali e ai terminali di scarico integrati nel fascione paracolpi posteriore, per rinnovare la riuscita linea della Mercedes A, che resta una berlina a cinque porte dalle forme muscolose e dal carattere sportivo, anche per quanto riguarda le qualità dinamiche. Nell’abitacolo ci sono il nuovo schermo di 8” (optional, prima era di 7”) e il sofisticato sistema multimediale, che ora ha più funzioni e dialoga con gli smartphone grazie ai sistemi MirrorLink e Apple CarPlay. Riviste, inoltre, la grafica della strumentazione e la forma del volante, mentre nella plancia spiccano inserti e tasti in argento satinato. Notevole la qualità di materiali e finiture, ma è un peccato che il “clima” automatico bizona si debba pagare a parte anche nelle versioni più ricche. Lo spazio abbonda soprattutto davanti, mentre la parte posteriore è meno ariosa (anche a causa dei finestrini piccoli), con il divano adatto a due adulti ma stretto per tre; solo discreto il baule (341 litri, oppure 1157 a divano ripiegato), peraltro di non eccezionale accessibilità. La A è disponibile con motori turbo con Stop&Start e tutti Euro 6. A benzina ci sono la 160, la 180 e la 200 (rispettivamente con un 1.6 da 102, 122 e 156 CV), la 220 e la 250 (disponibili anche con la trazione integrale) rispettivamente con un 2.0 da 184 e 211 CV che salgono a 218 nella versione Supersport. La gamma dei turbodiesel comprende la 1.5 da 90 o 109 CV, e al top della gamma il 2.1 da 136 o 177 cavalli, mentre al vertice assoluto c’è la sportivissima A 45 AMG con un pepatissimo 2.0 da ben 381 cavalli e la trazione integrale. Notevole la dotazione di sicurezza della Mercedes A, che oltre all’Esp prevede di serie 7 airbag, l’Attention Assist (che riconosce i segni di stanchezza del guidatore) e il sistema che in caso di pericolo di tamponamento attiva un dispositivo di avviso e rende più pronta la frenata. \n"+
                        " \n <br /> <br />" +
                        "<img src='classea'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Classe B");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Leggermente cresciuta rispetto alla vecchia versione (+9 cm di lunghezza, per un totale di 436 cm), la Mercedes Classe B ha una carrozzeria più bassa e sportiveggiante, migliorata anche nell’aerodinamica. L’abitacolo, realizzato con materiali di qualità e ben rifinito, accoglie comodamente quattro adulti (mentre il tunnel che sporge dal pavimento toglie spazio ai piedi di un eventuale quinto passeggero); a pagamento si può avere il divano che scorre avanti o indietro di 14 cm, utile per sfruttare al meglio il baule (486 litri). L’allestimento “base” Executive è già discretamente dotato e offre di serie anche il cruise control attivo (grazie a un radar “vede” il veicolo che precede e, se necessario, rallenta l’auto per mantenere la distanza di sicurezza); il più costoso Premium ha pure l’assetto ribassato, le sospensioni irrigidite e lo sterzo più diretto (e offre di serie il navigatore). La 180 e la 200 a benzina sono mosse da un 1.6 turbo con, rispettivamente, 122 e 156 CV, affiancate dalla 220 e dalla 250, mosse da un 2.0 da 184 o 211 cavalli. In alternativa c’è un 1.5 a gasolio da 90 o 109 CV, oppure un 2.1 da 136 o 177 CV. Al posto del cambio manuale a sei marce per la Mercedes Classe B si può avere il robotizzato a doppia frizione: non è regalato e alla leva principale nel piantone si deve fare l’abitudine, ma dolcezza e rapidità di funzionamento sono impeccabili, sia in modalità automatica, sia selezionando i 7 rapporti tramite le palette al volante. Tutti i motori in gamma sono in regola con l’omologazione Euro 6, come pure la 200 NGD bi-fuel 2.0 da 156 CV alimentata a benzina e a metano. La più “pulita” è, evidentemente, la versione elettrica (che dispone di ben 180 CV).\n"+
                        " \n <br /> <br />" +
                        "<img src='classeb'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("CLS");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Moderato ma azzeccato il restyling (concentrato soprattutto nel frontale: mascherina e nei “full led”) dedicato alla Mercedes CLS, la capostipite della categoria delle berline-coupé. Lunga quasi 5 metri, ha una carrozzeria muscolosa e grintosa al tempo stesso, che conserva una linea sportiva e aerodinamica definita dall’andamento parecchio inclinato del tetto che confluisce fluidamente nella lunga coda slanciata. Il frontale è dominato da una grande calandra con al centro la stella a tre punte Mercedes e corredato di ampie prese d’aria trapezoidali. L’abitacolo, al quale si accede comodamente da quattro grandi porte, offre una notevole abitabilità per quattro persone, che trovano una confortevole sistemazione su delle altrettanto ampie poltrone singole, e con l’aggiornamento risulta ancora più elegante e sontuoso. La qualità delle finiture e dei materiali utilizzati è elevata, e la dotazione di serie decisamente ricca. Sette i motori nella gamma della Mercedes CLS, tutti Euro 6 e ben prestanti: quattro a benzina (dal 3.5 V6 a iniezione diretta da 333 CV al 4.7 V8 da 408 CV, per arrivare agli esuberanti 5.5 V8 da 557 o 585 CV delle versioni sportive 63 AMG) e tre turbodiesel (un 2.1 a quattro cilindri da 170 o 204 CV e un 3.0 V6 da 258 CV, che scendono a 252 nelle versioni 4Matic). Le CLS sono dotate di trazione posteriore (a esclusione delle “4Matic”, provviste di trazione integrale) e di cambio automatico-sequenziale a sette o a nove marce.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='cls'>"+
                        "</body>" +
                        "</html>");
                marche=new ArrayList<String>();
                for(int i=0;i<auto.size();i++){
                    marche.add(auto.get(i).get(0));

                }

                adapter = new ArrayAdapter<>(getContext(),
                        android.R.layout.simple_list_item_1, marche);
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position,
                                            long id) {
                        FragmentManager fragmentmanager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();
                        ModelliFragment automodellifragment = new ModelliFragment();
                        final Bundle bundle = new Bundle();
                        ArrayList<String> temp = auto.get(position);
                        temp.remove(0);
                        bundle.putStringArrayList("modelli",temp);
                        automodellifragment.setArguments(bundle);
                        fragmentTransaction.replace(R.id.fragmentcontainer,automodellifragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                });
                break;
            case "scooter":
                auto=new ArrayList<ArrayList<String>>();
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.get(0).add("Honda");
                auto.get(0).add("Sh");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "125 e 150 scattano bene, motore e cambio sono a punto, la tenuta di strada è sicura e le sospensioni assicurano sempre il giusto comfort. Buono lo spazio per le gambe del pilota, nel vano sottosella può trovare posto anche un casco integrale. Manca il portaoggetti nel retroscudo, ma il bauletto è di serie. Curate le finiture, sempre piuttosto bassi i consumi.  Il 300i è molto agile, quasi come un 125, e ha un motore potente e grintoso, che garantisce un’ottima accelerazione e permette di cavarsela molto bene anche in autostrada. Di buona qualità le sospensioni, sicura la frenata (l'ABS è di serie, tranne che sull'economica versione Mode), discreto lo spazio per le gambe.  \n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='sh'>"+
                        "</body>" +
                        "</html>");
                auto.get(0).add("Vision");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "economico nell’acquisto e nella gestione, Honda dichiara per il 110 un consumo di 52 km/l a velocità costante di 60 km/h. La sella è bassa e comoda, lo spazio a disposizione sufficiente per tutte le taglie. Nel sottosella ci sta un casco integrale. Le prestazioni sono più che sufficienti per la città. Di serie il sistema di frenata integrale\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='vision'>"+
                        "</body>" +
                        "</html>");
                auto.get(0).add("Integra");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Moto o scooter? Questo è il dilemma che agita il sonno di chi vorrà scegliere l'Integra. Che monta un motore bicilindrico dalla coppia generosa, ma per aspetto e feeling è assimilabile a un grosso scooter. Le finiture sono curate, lo spazio sottosella non certo abbondante, il prezzo abbastanza salato\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='integra'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("Piaggio");
                auto.get(1).add("Liberty");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Grazie alla sue dimensioni compatte è perfetto per la città, dove sfodera un’ottima maneggevolezza. Le ruote grandi garantiscono anche stabilità e un discreto comfort sulle buche. Discrete le prestazioni di 125 e 150. \n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='liberty'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("Zip");
                auto.get(1).add("<html>" +
                    "<head>" +
                    "</head>" +
                    "<body>" +
                    " Chi ha le gambe lunghe sta un po’ stretto, ma nel traffico è agilissimo. Comoda la sella, regolabile in altezza. La versione con motore 50 a 4 tempi consuma poco: si fanno fino a 40 chilometri con un litro. Ed ha un prezzo interessante.\n" +
                    " \n"+
                    " \n <br /> <br />" +
                    "<img src='zip'>"+
                    "</body>" +
                    "</html>");
                auto.get(1).add("Vespa");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Il motore 300 spinge molto forte, soprattutto ai bassi regimi, non male anche a nuova 125 Super. Buona l’agilità, la GTS ha tanto sterzo e manovra in poco spazio. La frenata è sicura, la posizione di guida è comoda e lo spazio a disposizione del pilota abbondante. Il vano sottosella non è granché, ci sta un piccolo casco jet. I Prezzi salati, giustificati in parte dalle finiture e dal valore dell’usato.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='vespa'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Aprilia");
                auto.get(2).add("Sr");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "buone la tenuta di strada e la frenata. In sella si apprezza lo spazio per le gambe del pilota. Il motore a iniezione del Factory consuma poco ed è brillante in accelerazione. La versione “R” a carburatore costa meno\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='sr'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Sr motard");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Uno scooter dal DNA sportiveggiante che punta tutto su una guida dinamica, agile e frizzante. Due le motorizzazioni disponibili: 50 e 125 cc (scooter ingiustamente sfruttato del Toso)\n \n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='srmotard'>"+
                        "</body>" +
                        "</html>");

                marche=new ArrayList<String>();
                for(int i=0;i<auto.size();i++){
                    marche.add(auto.get(i).get(0));

                }

                adapter = new ArrayAdapter<>(getContext(),
                        android.R.layout.simple_list_item_1, marche);
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position,
                                            long id) {
                        FragmentManager fragmentmanager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();
                        ModelliFragment automodellifragment = new ModelliFragment();
                        final Bundle bundle = new Bundle();
                        ArrayList<String> temp = auto.get(position);
                        temp.remove(0);
                        bundle.putStringArrayList("modelli",temp);
                        automodellifragment.setArguments(bundle);
                        fragmentTransaction.replace(R.id.fragmentcontainer,automodellifragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                });
                break;
            case "moto":
                auto=new ArrayList<ArrayList<String>>();
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.get(0).add("BMW");
                auto.get(0).add("S1000rr");
                auto.get(0).add("<html>" +
                "<head>" +
                        "</head>" +
                        "<body>" +
                        " La supersportiva tedesca in versione 2015 è più potente e molto più efficace, soprattutto in pista. I sistemi elettronici di controllo sono più evoluti e arricchiti di nuove funzioni, ma è cambiato anche il telaio per migliorare la maneggevolezza. Resta comunque una moto per piloti esperti\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='s1000rr'>"+
                        "</body>" +
                        "</html>");
                auto.get(0).add("S1000xr");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        "Potentissima, maneggevole e con tanta elettronica, la XR ha un solo obiettivo: fare concorrenza alla Ducati Multistrada 1200, la moto che ha inventato il segmento delle crossover sportive.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='s1000xr'>"+
                        "</body>" +
                        "</html>");
                auto.get(0).add("r1200gs");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Rinnovata a inizio 2013 con l’esordio di un motore raffreddato ad aria e liquido, l'endurona BMW continua a essere una delle moto più vendute in Italia anche nella nuova versione. Molti i miglioramenti  e tanta elettronica che aiuta nella guida di tutti i giorni come il controllo di trazione,  sospensioni a controllo elettronico, 5 mappature di guida e ABS di serie. Grande nelle dimensioni ma sempre ben bilanciata, il peso importante si fa sentire solo a moto ferma, perchè in movimento diventa facile da guidare, grazie anche al baricentro basso. Le sospensioni sono rigide ma permettono una guida efficace sulle strade veloci, perdendo qualcosa nel fuoristrada più estremo. Le mappature sono utili soprattutto sul bagnato, riuscendo a controllare bene lo slittamento delle ruote, il motore è fluido nell’erogazione e i consumi sono contenuti. Buona la qualità generale, in linea con i migliori prodotti BMW. Anche la Adventure, nonostante la mole imponente e il peso importante che ne rende l'uso impegnativo in città, una volta su strada aperta è maneggevolissima e vola da una curva all'altra con una facilità insospettabile. La ciclistica svelta è ben supportata dal nuovo bicilindrico boxer raffreddato a liquido, un portento di potenza e spinta sin dai regimi medio-bassi che vibra poco ma non è altrettanto parco nei consumi. Il comfort è da prima della classe, così come l'elettronica: sospensioni regolabili ESA, controllo di trazione, mappature selezionabili dal pilota e ABS disinseribile con opzione off-road.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='r1200gs'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("Honda");
                auto.get(1).add("Africa Twin");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Il ritorno dell’Africa Twin è stato tra quelli più attesi del 2015 e, soprattutto tra quelli più azzeccati. La nuova Africa non fa rimpiangere la leggendaria moto degli anni 80 grazie a una ciclistica ben equilibrata e delle “vere” doti in offroad. Il motore è un bicilindrico frontemarcia da 95 CV mentre il telaio è un classico semiculla in acciaio accoppiato a un forcellone in alluminio. La moto è disponibile con due tipi di cambio: meccanico tradizionale, oppure automatico sequenziale con sistema a doppia frizione DCT. Da “vera” fuoristrada la ciclistica, cerchi a raggi da 21 pollici davanti e da 18 dietro, con pneumatici (Dunlop Trailmax) con camera d’aria, sviluppati apposta per l’Africa Twin. Di qualità le sospensioni: forcella a steli rovesciati da 45 mm e ammortizzatore sono Showa, hanno un'abbondante escursione (230 mm all’anteriore, 220 mm al posteriore) e sono completamente regolabili.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='africatwin'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("CBR 1000rr");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " La nuova Honda CBR 1000 RR Fireblade adotta soluzioni tecniche raffinate, un’elettronica di prima qualità ed è disponibile in tre versioni: base, SP e SP2, quest’ultima prodotta in 500 esemplari e destinata ai campionati Superbike e Superstock. Rinnovata nell'estetica rispetto alla versione 2012, pesa 15 kg in meno e ha una potenza di 192 CV (11 più di prima). Identica nel telaio e nel motore alla versione base, la SP è ancora più leggera grazie al serbatoio in titanio e alla batteria agli ioni di litio. Le due versioni differiscono anche per le sospensioni, semi-attive a controllo elettronico sulla SP e per gli impiant frenantii: Tokico sulla CBR 1000 RR con dischi da 320 mm e Brembo sulla SP, con dischi dello stesso diametro e pinze monoblocco M50. Il cruscotto è quello della RCV 213V: schermo TFT a retroilluminazione variabile con comandi sul blocchetto sinistro del manubrio. Notevole l’elettronica di serie, che comprende cinque riding mode disponibili: tre preimpostati (1 Fast, 2 Fun, 3 Safe) e due “User” personalizzabili dal pilota. I riding mode gestiscono il controllo di trazione HSTC collegato con il controllo antimpennata (entrambi disinseribili), il Power Control (cinque modalità di erogazione della potenza) e il Selector Engine Brake che regola il freno motore. L’ABS Cornering gestisce la frenata tenendo conto dell’inclinazione della moto in curva e gestisce il Rear Lift Control, impedendo  il sollevamento della ruota posteriore in staccata.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='cbr1000rr'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("CB-f");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " La 500 è facile da guidare e poco assetata, scende in piega precisa mentre il motore è sempre facile da gestire. Le sospensioni non amano la guida sportiva, ma incassano bene le buche, comoda la posizione di guida, buono il prezzo. ABS di serie.\n" +
                        "La 650 è ben fatta, snella e maneggevole, è studiata per adattarsi anche ai piloti meno esperti. Il motore è un quattro cilindri in linea di 649 cm3 con doppio albero a camme in testa, 4 valvole per cilindro e raffreddamento a liquido accoppiato a un cambio a 6 marce. Studiato oltre che per consumare il meno possibile limitando gli attriti interni (21 km/l secondo lo standard WMTC), anche per dare una spinta sotto i 4.000 giri. Abbastanza semplice la ciclistica: il telaio è un doppio trave in acciaio impreziosito dal forcellone bibraccio in alluminio, la forcella con steli di 41 mm è priva di regolazione e il monoammortizzatore è regolabile nel solo precarico su 7 posizioni predefinite. L’impianto frenante è invece di prim'ordine, dotato di ABS a due canali di serie, e composto da due dischi con profilo a margherita anteriori di 320 mm e su un disco singolo posteriore di 240 mm sempre wave. Tutto digitale il cruscotto con la strumentazione divisa in due quadranti. Un po' salato il prezzo.\n" +
                        "La versione 125 monta il monocilindrico Honda 4 tempi dotato di contralbero di bilanciamento e alimentazione a iniezione, capace (secondo la casa) di consumi record: ben 51,3 km/l nel ciclo medio WMTC, ossia fino a 600 km riempiendo il serbatoio da 13 litri. Le prestazioni sono in linea con le caratteristiche del modello: 10,6 CV di potenza massima, la sella a soli 77,5 cm da terra e il peso di soli 128 kg (in ordine di marcia e con il pieno), adatta anche a chi ha poca esperienza. Nuove anche le dimensioni delle ruote che salgono da 17 a 18”, tradizionali le sospensioni: forcella con steli da 31 mm e mono posteriore regolabile. L'impianto frenante è formato da un disco da 240 mm davanti e un economico tamburo al posteriore.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='cbf'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Aprilia");
                auto.get(2).add("Rsv4");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " snella come una 600 e molto potente, è rapidissima nell’impostare le curve, ma anche stabile nei tratti veloci. Le prestazioni sono elevate e per gestirle ci vuole esperienza. Buona la posizione di guida anche per i più alti, mentre nelle staccate violente in pista il retrotreno tende ad alleggerirsi un po’.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='rsv4'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Rs125");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " La posizione di guida è da sportiva vera, quindi poco comoda. Buone le finiture, l'Aprilia RS 125 (a 2 tempi) è per i ragazzi che sognano la pista, costruita con componenti di qualità. Rapidissima nel passare da una curva all’altra e precisa nel tenere le traiettorie, ha freni a punto. La forcella delude un po’, nella guida sportiva va in crisi. Frenata e tenuta di strada sono molto buone, la posizione di guida è scomoda. Il motore spinge bene agli alti regimi e l’agilità è ottima.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='rs125'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Rx");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " 50: è nata per il fuoristrada (ma non per le gare), ha sospensioni morbide che assorbono bene le buche e se la cava bene anche sull’asfalto. Il motore con cambio a sei marce è grintoso. La sella è alta e poco imbottita \n" +
                        "125: agile e leggera, con un motore brillante e una buona spinta ai medi e alti regimi. La RX è un’enduro con una linea simile alle grosse bicilindriche da gara.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='rx125'>"+
                        "</body>" +
                        "</html>");
                marche=new ArrayList<String>();
                for(int i=0;i<auto.size();i++){
                    marche.add(auto.get(i).get(0));

                }

                adapter = new ArrayAdapter<>(getContext(),
                        android.R.layout.simple_list_item_1, marche);
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position,
                                            long id) {
                        FragmentManager fragmentmanager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();
                        ModelliFragment automodellifragment = new ModelliFragment();
                        final Bundle bundle = new Bundle();
                        ArrayList<String> temp = auto.get(position);
                        temp.remove(0);
                        bundle.putStringArrayList("modelli",temp);
                        automodellifragment.setArguments(bundle);
                        fragmentTransaction.replace(R.id.fragmentcontainer,automodellifragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                });
                break;
            case "camion":
                auto=new ArrayList<ArrayList<String>>();
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.add(new ArrayList<String>());
                auto.get(0).add("Scania");

                auto.get(0).add("t730");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " \n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='t730'>"+
                        "</body>" +
                        "</html>");
                auto.get(0).add("s730");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Con la nuova serie S, i viaggi a lungo raggio diventano ancora più confortevoli. Gli interni sono estremamente ampi e lussuosi, mentre il pianale piatto, l'ampia disponibilit‡ di vani portaoggetti e l'eccezionale visuale dalla postazione di guida contribuiscono a rendere unico il carattere della nuova cabina S.\n\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='s730'>"+
                        "</body>" +
                        "</html>");
                auto.get(0).add("p270");
                auto.get(0).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " \n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='p270'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("Volvo");
                auto.get(1).add("fh750");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " La soluzione I-Shift Dual Clutch è offerta per il momento solo in abbinamento ai motori da 12,8 litri, mentre i maxi 16 litri non dovrebbero a logica neppure averne bisogno (se non per le gravose mission nordiche) e infatti ne sono per il momento esclusi. Sorprende quindi che il modello in prova sia nella versione da 540 cv, cioË il massimo degli FH 12,8 litri, quando forse i benefici effetti della doppia frizione sarebbero stati pi˘ evidenti su motori meno potenti, magari anche con migliori ricadute su fronte dei consumi. Sono queste le considerazioni che mi frullano in mente mentre ammiro il nuovo FH che, una volta digerita la calandra a nido d’ape, Ë certamente un veicolo dal grande fascino e tanta personalit‡, in parole pi˘ semplici: bello. Tralascio la descrizione dellíesterno della cabina che qui Ë la versione Globetrotter XL, il top di gamma, perchÈ le immagini parlano pi˘ di tante parole. Solo una nota di merito ai gruppi ottici dal design accattivante e allíampia dotazione di gavoni esterni con quelli maggiori collegati allíinterno con una doppia botola (una per lato) sotto la cuccetta. Ci trasferiamo allíinterno per spendere ancora parole di encomio per il posto di guida, che credo sia in assoluto quello con il maggior numero di regolazioni per poterlo adattare nel migliore dei modi. Cosi infatti Ë quello che faccio, notando perÚ che manca nella dotazione generale un tavolino, o semplicemente un piano di lavoro, da usare durante le pause, magari anche per consumare un frugale pastoÖ nessuno Ë perfetto! In compenso líaltezza in cabina Ë a prova di vichingo e si perdona anche il leggero gradino del tunnel (10 cm) che lascia comunque tanto spazio, qui usato per allestire una serie di gavoni che dovrebbero rispondere in maniera totale a tutte le esigenze di storage. Non cíË la seconda cuccetta (sostituita appunto da una fila di vani), ma in compenso quella bassa Ë di dimensioni pi˘ che generose, asservita anche da una serie di luci di cortesia e di comandi rinviati in zona in modo che il comfort sia totale. Neppure il caso di perdere tempo sulla qualità dei materiali, di prima classe assoluta.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='fh750'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("fl");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Il Volvo FL è il pi˘ piccolo autocarro prodotto da Volvo Trucks e assemblato negli stabilimenti belgi di Gand del gruppo svedese.\n" +
                        "» adatto al trasporto locale e regionale di merci, a servizi di raccolta rifiuti, a camion da costruzione o come trattore stradale leggero.\n" +
                        "Nel 1986 ha vinto il premio International Truck of the Year.\n" +
                        "Mosso nella versione standard da un propulsore diesel da 7 litri erogante 240 CV Ë situato nella fascia di autocarri fino a 12 tonn di P.T.T. ed in allestimento con cassone per il trasporto di merci offre cubature utili fino a 42mc e la possibilit‡ di posizionare a terra sino a 16 pallet tipi \"EUR\".\n" +
                        "Nell'autunno 2007, Ë stato lanciato il nuovo Volvo FL (prodotto dal 2006). Esso Ë disponibile con motore diesel da 7,2 litri da 240 e 280 CV ed Ë in vendita soltanto in Europa (con l'unica eccezione della Turchia), mentre in altri paesi come Australia, Bulgaria, Brunei, Cina, Indonesia, Malesia, Filippine, Sudafrica, Tanzania e Thailandia Ë ancora venduto nella precedente versione.\n\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='fl'>"+
                        "</body>" +
                        "</html>");
                auto.get(1).add("fmx");
                auto.get(1).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " I motori sono gli Euro 6 D11K da 330, 370, 410 e 450 CV oppure il D13K da 420, 460 e 500 CV. La catena cinematica puÚ essere 6◊4, 8◊4, 6◊6 o 8◊6 con trazione sullíassale anteriore. Oltre al classico cambio manuale Ë disponibile anche l'automatizzato Ishift o l'automatico Powertronic pensati appositamente per il movimento terra.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='fmx'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Mercedes");
                auto.get(2).add("Actros");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Con l'Actros fino a 250 tonnellate entra in circolazione un trattore stradale progettato e costruito sistematicamente per movimentare carichi particolarmente pesanti e ingombranti. Ma non basta: l'Actros fino a 250 tonnellate fissa nuovi standard di riferimento in termini di comfort, prestazioni e flessibilit‡. A prima vista, con le cabine GigaSpace e BigSpace, questo veicolo dimostra gi‡ di offrire esattamente il comfort di lavoro e l'abitabilit‡ di cui avete bisogno nei trasporti pesanti, sia ad ogni viaggio che nelle pause.\n" +
                        "\n" +
                        "Con i suoi potenti e affidabili motori Euro?VI, il cambio automatizzato PowerShift Mercedes 3 e la frizione con Turbo Retarder, questo veicolo dispone di un sistema di trazione potente ed estremamente robusto che garantisce sempre la potenza richiesta per svolgere il lavoro quotidiano dei trasporti pesanti. E per consentirvi di sfruttare questa enorme potenza in tutta sicurezza, abbiamo dotato l'Actros fino a 250 tonnellate di una struttura delle sospensioni e del telaio particolarmente solida per trasmettere la forza disponibile con precisione alle ruote anche a massimo carico.\n" +
                        "\n" +
                        "A garantire la massima flessibilità e un adeguamento ottimale alle esigenze di utilizzo provvede l'ampia variet‡ di equipaggiamenti e modelli costruttivi, in grado di offrire sempre la configurazione perfetta per ogni tipo di impiego. Per prendere i trasporti pesanti con leggerezza. \n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='actros'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Antos");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Il settore della distribuzione ha le proprie regole.\n" +
                        "L'Antos Ë stato progettato espressamente per la distribuzione oltre 18 t, allo scopo di andare incontro al 100% alle esigenze di trasporto, ad esempio, di generi alimentari, surgelati, liquidi o silos: un'ampia scelta di varianti di cabina offre i presupposti ideali per soddisfare praticamente ogni desiderio in termini di lunghezza della sovrastruttura, carico utile, abitabilit‡ e visione panoramica. Inoltre la postazione di guida ergonomica, con i suoi confortevoli e riposanti sedili, il volante multifunzione e la plancia portastrumenti facilmente leggibile, rende il veicolo estremamente maneggevole da usare in modo facile e preciso. Anche il cambio PowerShift?Mercedes 3, i brillanti motori Euro VI e le combinazioni di cambio e assali ottimizzate in base alle esigenze di impiego concorrono a migliorare la sensazione di guida.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='antos'>"+
                        "</body>" +
                        "</html>");
                auto.get(2).add("Arocs");
                auto.get(2).add("<html>" +
                        "<head>" +
                        "</head>" +
                        "<body>" +
                        " Il nuovo Arocs coniuga forza, robustezza ed efficienza in modo unico, rinnovando incisivamente la fortunata tradizione dei veicoli da cantiere Mercedes-Benz, una storia lunga oltre 110 anni. Ma non basta: questo veicolo si proietta nel futuro con tecnologie innovative e avveniristiche, dimostrando in ogni settore di impiego da dove viene e per quale scopo Ë stato progettato.\n" +
                        "\n" +
                        "Con la sua configurazione della catena cinematica potente e resistente, potete affrontare con successo qualsiasi situazione di marcia. E questo perchÈ líArocs trasmette in modo affidabile la sua elevata potenza sulla strada anche nelle condizioni pi˘ gravose. A questo provvede la sua robusta e solida struttura dellíassetto, delle sospensioni e del telaio che si distingue anche per una elevata resistenza alle sollecitazioni.\n" +
                        "\n" +
                        "Una base solida per il vostro successo Ë rappresentata anche dallíefficienza dellíArocs. I bassi consumi dei motori Euro VI di serie, la durata pi˘ lunga di numerosi componenti, i costi di riparazione e manutenzione pi˘ bassi e la facilit‡ di allestimento, oltre ad uníampia gamma di possibilit‡ per qualsiasi tipo di impiego assicurano un utilizzo redditivo del veicolo. In poche parole: líArocs Ë in grado di offrire tutto quello che la pratica richiede, sia in cantiere che su strada. Salite a bordo e sfruttate una nuova forza nel cantiere.\n" +
                        " \n"+
                        " \n <br /> <br />" +
                        "<img src='arocs'>"+
                        "</body>" +
                        "</html>");
                marche=new ArrayList<String>();
                for(int i=0;i<auto.size();i++){
                    marche.add(auto.get(i).get(0));

                }

                adapter = new ArrayAdapter<>(getContext(),
                        android.R.layout.simple_list_item_1, marche);
                listview.setAdapter(adapter);
                listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position,
                                            long id) {
                        FragmentManager fragmentmanager = getFragmentManager();
                        FragmentTransaction fragmentTransaction = fragmentmanager.beginTransaction();
                        ModelliFragment automodellifragment = new ModelliFragment();
                        final Bundle bundle = new Bundle();
                        ArrayList<String> temp = auto.get(position);
                        temp.remove(0);
                        bundle.putStringArrayList("modelli",temp);
                        automodellifragment.setArguments(bundle);
                        fragmentTransaction.replace(R.id.fragmentcontainer,automodellifragment);
                        fragmentTransaction.addToBackStack(null);
                        fragmentTransaction.commit();
                    }
                });
                break;
        }

        return view;
    }

    // TODO: Rename method, update argument and hook method into UI event
    public void onButtonPressed(Uri uri) {
        if (mListener != null) {
            mListener.onFragmentInteraction(uri);
        }
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnFragmentInteractionListener) {
            mListener = (OnFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }
    public interface OnFragmentInteractionListener {
        // TODO: Update argument type and name
        void onFragmentInteraction(Uri uri);
    }
}




/*"<html>" +
        "<head>" +
        "</head>" +
        "<body>" +
        " \n" +
        " \n"+
        " \n <br /> <br />" +
        "<img src='cls'>"+
        "</body>" +
        "</html>");
        */