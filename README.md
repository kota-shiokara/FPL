# FPL
This is my library for Processing

## Usage
After building with "[Build](#build)", copy the libraries in `library/tmp` to `processing/libraries` or  a folder called `code` created in the sketch folder.  
If you want detailed explanation of API, please read [javadoc](https://kota-shiokara.github.io/FPL/javadoc/)!

## Link
- [javadoc](https://kota-shiokara.github.io/FPL/javadoc/)
- [Test Report](https://kota-shiokara.github.io/FPL/reports/)

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