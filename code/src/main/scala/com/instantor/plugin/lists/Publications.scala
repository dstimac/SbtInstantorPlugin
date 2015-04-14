package com.instantor.plugin
package lists

import sbt._

trait Publications {
  object Api {
    val Shared  = "com.instantor.bsp" % "bspdsapi-apishared" % "0.6.0"
  }

  object BspClientApi {
    val Model = "com.instantor.bsp" % "notificatorclient-generated"      % "0.3.0"
    val Core  = "com.instantor.bsp" % "notificatorclient-generated_2.10" % "0.3.0"
  }

  object BspCommon {
    val Commons   = "com.instantor.bsp" % "bspcommon-commons"   % "0.11.3"
    val Bases     = "com.instantor.bsp" % "bspcommon-bases"     % "0.11.3"
    val Transport = "com.instantor.bsp" % "bspcommon-transport" % "0.11.3"
  }

  object BspOtpProvider {
    val ClientJava = "com.instantor.bsp.otp" % "bspotpprovider-client-java" % "0.4.15"
  }

  object ClientInfo {
    val JApi     = "com.instantor.clientinfo" %  "clientinfo-japi"     % "0.4.1"
    val Extended = "com.instantor.clientinfo" %% "clientinfo-extended" % "0.4.1"
  }

  object Consolidator {
    val Model = "com.instantor.bsp" % "bspdsapi-consolidator" % "0.6.0"
  }

  object EDS {
    val ModelInterfaces = "com.instantor.eds" %% "eds-model-interfaces" % "0.12.6"
    val ModelServices   = "com.instantor.eds" %% "eds-model-services"   % "0.12.6"
  }

  object Instantor {
    val Api     = "com.instantor" % "instantor-api" % "0.4.3"

    val Commons = "com.instantor.commons" %% "instantorcommons" % "0.0.3"
  }

  object PropsLoader {
    val Api  = "com.instantor.props" % "propsloader-api"  % "0.3.18"
    val Core = "com.instantor.props" % "propsloader-core" % "0.3.18"
  }

  object Sandbox {
    val NameCompare = "com.instantor.ip.sandbox" %% "ip-namecompare-core" % "0.1.4"
    val Search      = "com.instantor.ip.sandbox" %% "ip-search-core"      % "2.0.0"
  }

  object TotaLog {
    val Interfaces = "com.instantor.totalog" % "totalog-interfaces" % "0.6.0"
    val Transport  = "com.instantor.totalog" % "totalog-transport"  % "0.6.1"
    val Search     = "com.instantor.totalog" % "totalog-search"     % "0.6.0"
  }

  @deprecated("Now project dependency in BspCommon.", "0.3.66")
  object Transport {
    val Common = "com.instantor.bsp" % "bspdsapi-transportcommon" % "0.5.0"
  }
}
