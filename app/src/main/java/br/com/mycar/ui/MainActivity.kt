package br.com.mycar.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.com.mycar.R
import br.com.mycar.data.Service
import br.com.mycar.model.contract.MainContract
import br.com.mycar.model.entity.Place
import br.com.mycar.ui.adapter.PlaceAdapter

class MainActivity : AppCompatActivity(), MainContract {


    private lateinit var mSearch: EditText
    private lateinit var mAccount: ImageView
    private lateinit var mState: TextView
    private lateinit var mClickState: CardView
    private lateinit var mRecycler: RecyclerView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initIDS()

        mRecycler.adapter = PlaceAdapter(Service.getPlaces(), this, this)
        mRecycler.layoutManager = LinearLayoutManager(this)


    }
    //click  adapter
    override fun click(place: Place) {

    }

    private fun initIDS(){
        mRecycler = findViewById(R.id.recycler)
        mSearch = findViewById(R.id.search)
        mAccount = findViewById(R.id.account)
        mState = findViewById(R.id.state)
        mClickState = findViewById(R.id.click_state)
    }
}
