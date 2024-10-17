import com.stella.build_logic.configureVerifyDetekt
import io.gitlab.arturbosch.detekt.Detekt

configureVerifyDetekt()

tasks.withType<Detekt>().configureEach {
    buildUponDefaultConfig = true
    parallel = true
    config = files("$rootDir/config/detekt/detekt.yml")
}