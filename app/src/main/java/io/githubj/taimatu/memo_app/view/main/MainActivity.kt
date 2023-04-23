package io.githubj.taimatu.memo_app.view.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import io.githubj.taimatu.memo_app.R
import io.githubj.taimatu.memo_app.view.read.ReadActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // メニュー追加
    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_list, menu)
        return super.onCreateOptionsMenu(menu)
    }

    // メニュー選択処理追加
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent = when(item.itemId) {
            R.id.read_memo ->
                Intent(this, ReadActivity::class.java)
            R.id.write_memo ->
                // todo メモを書くの画面へ遷移する
                Intent(this, ReadActivity::class.java)
            R.id.setting ->
                // todo 設定の画面へ遷移する
                Intent(this, ReadActivity::class.java)
            else ->
                throw Exception("メニューIDが存在しません")
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}