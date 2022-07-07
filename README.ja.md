# FPL
これは個人的に使えないかな～ってものを集めた(る予定の)Processing用のライブラリです。

[En](./README.md) | Ja

## 使い方
二つ方法があります。
1. クローンしてきた後、"[ビルド](#ビルド)"にてビルドし、`library/tmp` に生成されたjarファイルを`processing/libraries`かスケッチフォルダに`code`を作ってコピーしてください。
2. [Release](https://github.com/kota-shiokara/FPL/releases) からFPL-{latest_version}.jarをダウンロードして、`processing/libraries`かスケッチフォルダに`code`を作って置いてください。

APIの詳細については、[javadoc](https://kota-shiokara.github.io/FPL/javadoc/) 参照してください！

## リンク
- [javadoc](https://kota-shiokara.github.io/FPL/javadoc/)
- [Test Report](https://kota-shiokara.github.io/FPL/reports/)

## 開発に関して
1. フォークしてください ([https://github.com/kota-shiokara/FPL/fork](https://github.com/kota-shiokara/FPL/fork))
2. 機能追加ブランチを作ってください (ex. git checkout -b feature/{your-new-feature})
3. 変更をコミットしてください (ex. git commit -am 'Add some feature')
4. プッシュしてください (ex. git push origin feature/{your-new-feature})
5. developブランチに向けてプルリクエストを作ってください

私はJetBrains社のIntellij IDEAを使用していますが、ビルドはgradleに任せているためjavaを書くことができるエディタであれば特に構いませんが、エディタ特有のファイルが生成された場合、gitignoreに追記して貰えると助かります。

もちろん、issueでの提案や質問も待っています！

## ビルド
```shell
./gradlew -q
```

## Javadocの生成
`build.gradle`を書き換えてください。
```build.gradle
//    implementation group: 'org.processing', name: 'core', version: '3.3.7'

                ↓

    implementation group: 'org.processing', name: 'core', version: '3.3.7'
```
その後、下記のコマンドを入力してください。
```shell
./gradlew javadoc
```

## テスト
```shell
./gradlew test
```

## 開発者情報
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## 報告に関して
バグの報告、改善の要望につきましては[issue](https://github.com/kota-shiokara/FPL/issue) もしくは上記連絡先にお願いします。

## License
[MIT License](https://choosealicense.com/licenses/mit/)