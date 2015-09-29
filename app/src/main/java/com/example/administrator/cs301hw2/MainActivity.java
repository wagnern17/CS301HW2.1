package com.example.administrator.cs301hw2;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.HashMap;


/* https://www.youtube.com/watch?v=SaXYFHYGLj4 */

public class MainActivity extends ActionBarActivity implements View.OnClickListener,AdapterView.OnItemSelectedListener {

    private Button addPlayer;
    private Button addTeam;
    private Button playButton;

    private EditText playerName;
    private EditText playerNum;
    private EditText playerGoals;
    private EditText playerAssists;
    private EditText playerPen;
    private EditText playerPos;
    private EditText teamName;
    private EditText teamWins;
    private EditText teamLoss;
    private EditText teamDraw;

    private TextView teamSet;
    private TextView numSet;
    private TextView goalSet;
    private TextView assistsSet;
    private TextView penSet;
    private TextView posSet;
    private TextView winSet;
    private TextView lossSet;
    private TextView drawSet;
    private TextView winStatSet;
    private TextView teamWinStat;
    private TextView lossStatSet;
    private TextView teamLossStat;
    private TextView drawStatSet;
    private TextView teamDrawStat;

    private ImageView playerPic;

    private Spinner teamSpinner;

    public HashMap<String, Team> teamHash;
    public HashMap<String, Player> playerHash;

    ArrayList<String> playerList;
    ArrayList<String> teamList;
    ArrayList<ImageView> playerImageList;

    private ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupPlayButton();
        setupAddPlayer();
        setupAddTeam();
        setupTeamSpinner();
        setupTeam();
        setupPlayer();

        playerHash=new HashMap<String,Player>();
        playerHash.put("", new Player());

        playerList = new ArrayList<String>();
        playerList.add("");

        teamList = new ArrayList<String>();
        teamList.add("");
    }

    private void setupTeam() {
        teamName = (EditText) findViewById(R.id.teamName);
        teamWins = (EditText) findViewById(R.id.teamWins);
        teamLoss = (EditText) findViewById(R.id.teamLoss);
        teamDraw = (EditText) findViewById(R.id.teamDraw);

        winSet = (TextView) findViewById(R.id.winSet);
        lossSet = (TextView) findViewById(R.id.lossSet);
        drawSet = (TextView) findViewById(R.id.drawSet);
        winStatSet = (TextView) findViewById(R.id.winStatSet);
        teamWinStat = (TextView) findViewById(R.id.teamWinStat);
        lossStatSet = (TextView) findViewById(R.id.lossStatSet);
        teamLossStat = (TextView) findViewById(R.id.teamLossStat);
        drawStatSet = (TextView) findViewById(R.id.drawStatSet);
        teamDrawStat = (TextView) findViewById(R.id.teamDrawStat);
    }

    private void setupPlayer() {
        playerName = (EditText) findViewById(R.id.playerName);
        playerNum = (EditText) findViewById(R.id.playerNum);
        playerGoals = (EditText) findViewById(R.id.playerGoals);
        playerAssists = (EditText) findViewById(R.id.playerAssists);
        playerPen = (EditText) findViewById(R.id.playerPen);
        playerPos = (EditText) findViewById(R.id.playerPos);

        teamSet = (TextView) findViewById(R.id.teamSet);
        numSet = (TextView) findViewById(R.id.numSet);
        goalSet = (TextView) findViewById(R.id.goalSet);
        assistsSet = (TextView) findViewById(R.id.assistsSet);
        penSet = (TextView) findViewById(R.id.penSet);
        posSet = (TextView) findViewById(R.id.posSet);
    }

    private void setupTeamSpinner() {
        teamSpinner = (Spinner) findViewById(R.id.teamSpinner);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,playerList);
        teamSpinner.setAdapter(adapter);
        teamSpinner.setOnItemSelectedListener(this);
    }

    private void setupAddTeam() {
        addTeam = (Button) findViewById(R.id.addTeam);
        addTeam.setOnClickListener(this);
    }

    private void setupAddPlayer() {
        addPlayer = (Button) findViewById(R.id.addPlayer);
        addPlayer.setOnClickListener(this);
    }

    private void setupPlayButton() {
        playButton = (Button) findViewById(R.id.playButton);
        playButton.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        if(v==playButton) {
            startActivity(new Intent(MainActivity.this, SecondaryActivity.class));
        }

        if(v==addPlayer) {

        }

        if(v==addTeam) {

        }
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
