# FPL
This is my library for Processing

En | [Ja](./README.ja.md)

## Usage
There are two ways
1. After clone and building with "[Build](#build)", copy the libraries in `library/tmp` to `processing/libraries` or the `code` folder that exists in sketch folder.
2. Download FPL-{latest_version}.jar from the Release section. After that, put it in `processing/libraries` or the `code` folder that exists in sketch folder.

If you want detailed explanation of API, please read [javadoc](https://kota-shiokara.github.io/FPL/javadoc/)!

## Link
- [javadoc](https://kota-shiokara.github.io/FPL/javadoc/)
- [Test Report](https://kota-shiokara.github.io/FPL/reports/)

## Development
1. Fork ([https://github.com/kota-shiokara/FPL/fork](https://github.com/kota-shiokara/FPL/fork))
2. Create your feature branch (ex. git checkout -b feature/{your-new-feature})
3. Commit your changes (ex. git commit -am 'Add some feature')
4. Push to the branch (ex. git push origin feature/{your-new-feature})
5. Create new Pull Request for develop branch

I'm using Intellij IDEA by JetBrains, but any editor that can write java is fine. Because I let gradle handle the build. **If an editor-specific file is generated, please you add to gitignore.**

Of course, I'm waiting for your suggestions and questions on the issue.

## Build
```shell
./gradlew -q
```

## Generate Javadoc
Edit `build.gradle`
```build.gradle
//    implementation group: 'org.processing', name: 'core', version: '3.3.7'

                ↓

    implementation group: 'org.processing', name: 'core', version: '3.3.7'
```
After it, This command
```shell
./gradlew javadoc
```

## Test
```shell
./gradlew test
```

## Author
- [kota-shiokara](https://github.com/kota-shiokara)
- Email: ikanoshiokara.fun@gmail.com
- Twitter: [@shiokara_create](https://twitter.com/shiokara_create)

## About Report
Please use [issue](https://github.com/kota-shiokara/FPL/issues) for filing feature requests and bug reports. Or use the contact information above.

## License
[MIT License](https://choosealicense.com/licenses/mit/)