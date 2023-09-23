package com.imsoft.softwarecatalogapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.imsoft.softwarecatalogapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val softID = intent.getIntExtra(SOFT_ID_EXTRA,-1)
        val soft = softFromID(softID)

        if (soft != null)
        {
            binding.cover.setImageResource(soft.cover)
            binding.title.text = soft.title
            binding.description.text = soft.description
            binding.author.text = soft.author
        }
    }

    private fun softFromID(softID: Int): SoftTech? {
        for (soft in softList)
        {
            if (soft.id == softID)
                return soft
        }
        return null
    }
}