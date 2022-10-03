package com.example.practica1

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import com.bumptech.glide.Glide
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.example.practica1.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    val urlEsttik: String = "https://youtube.fandom.com/error"
    val urlViktor: String = "https://es.famousbirthdays.com/people/viktor-kamenov.html"
    val urlChris: String = "https://es.wikipedia.org/wiki/Chris_Cornell"
    val urlPablo: String = "https://es.wikipedia.org/wiki/Pablo_S%C3%A1nchez_Pardines"

    val openURL = Intent(Intent.ACTION_VIEW)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Botones

        binding.content.mbWikipedia.setOnClickListener {

            openURL.data = Uri.parse(urlEsttik)

            startActivity(openURL)

        }

        binding.content.mbWikipedia2.setOnClickListener {

            openURL.data = Uri.parse(urlViktor)

            startActivity(openURL)

        }

        binding.content.mbWikipedia3.setOnClickListener {

            openURL.data = Uri.parse(urlChris)

            startActivity(openURL)

        }

        binding.content.mbWikipedia4.setOnClickListener {

            openURL.data = Uri.parse(urlPablo)

            startActivity(openURL)

        }

        //Glide

        loadImage()
        loadImage2()
        loadImage3()
        loadImage4()

    }

    private fun loadImage(url: String = "https://album.mediaset.es/cimg/2022/04/08/esttik_ed7b.jpeg?w=1024") {

        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.iv)

    }

    private fun loadImage2(url: String = "https://cdn.shopify.com/s/files/1/2513/1876/files/kamenov.jpg?v=1625571749") {

        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.iv2)

    }

    private fun loadImage3(url: String = "https://cdn.news.bandsintown.com/wp-content/uploads/2016/12/header_chriscornell_Jimena_Garrote1.png?nf_resize=fit&w=720") {

        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.iv3)

    }

    private fun loadImage4(url: String = "https://alexblanquer.files.wordpress.com/2016/03/10333283_1492587744306595_1916348117045252821_o-1.jpg?w=1200") {

        Glide.with(this)
            .load(url)
            .diskCacheStrategy(DiskCacheStrategy.RESOURCE)
            .centerCrop()
            .into(binding.content.iv4)

    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_scrolling, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}