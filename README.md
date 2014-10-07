Run the test with `./gradlew test`

*My goal is to get this test to pass with the APT plugin applied.*

As it stands, I cannot get code generation to run on `TestModule` the when I have the 'android-apt'
plugin applied, regardless of anything else.

If you check out the `provided` branch, you can see that the test passes using `provided` rather
than `apt` and 'androidTestApt', as long as the `android-apt` plugin is not applied.

If you check out the `aptfail` branch, you can see that merely applying the apt plugin causes
the test that passed in the `provided` branch to fail.