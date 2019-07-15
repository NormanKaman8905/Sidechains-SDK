package com.horizen

import scala.collection.immutable.Map
import akka.actor.ActorRef

import com.horizen.block.SidechainBlock

import scorex.core.{ModifierTypeId, NodeViewModifier}
import scorex.core.api.http.{ApiRoute, NodeViewApiRoute, PeersApiRoute, UtilsApiRoute}
import scorex.core.app.Application
import scorex.core.network.{NodeViewSynchronizerRef, PeerFeature}
import scorex.core.network.message.MessageSpec
import scorex.core.serialization.ScorexSerializer
import scorex.core.settings.ScorexSettings
import scorex.util.ScorexLogging

class SidechainApp(val settingsFilename: String) {}
/*
  extends Application
  with ScorexLogging
{
  override type TX = SidechainTypes#SCBT
  override type PMOD = SidechainBlock
  override type NVHT = SidechainNodeViewHolder

  private val sidechainSettings = SidechainSettings.read(Some(settingsFilename))
  override implicit val settings: ScorexSettings = sidechainSettings.scorexSettings

  log.debug(s"Starting application with settings \n$sidechainSettings")

  override val apiRoutes: Seq[ApiRoute] = Seq[ApiRoute](
    //ChainApiRoute(settings.restApi, nodeViewHolderRef, miner),
    //TransactionApiRoute(settings.restApi, nodeViewHolderRef),
    //DebugApiRoute(settings.restApi, nodeViewHolderRef, miner),
    //WalletApiRoute(settings.restApi, nodeViewHolderRef),
    //StatsApiRoute(settings.restApi, nodeViewHolderRef),
    UtilsApiRoute(settings.restApi),
    //NodeViewApiRoute[SidechainTypes#SCBT](settings.restApi, nodeViewHolderRef),
    PeersApiRoute(peerManagerRef, networkControllerRef, timeProvider, settings.restApi)
  )

  override protected val features: Seq[PeerFeature] = Seq()

  override protected val additionalMessageSpecs: Seq[MessageSpec[_]] = Seq()

  override val nodeViewHolderRef: ActorRef = SidechainNodeViewHolderRef(sidechainSettings, timeProvider)

  override val nodeViewSynchronizer: ActorRef =
    actorSystem.actorOf(NodeViewSynchronizerRef.props[SidechainTypes#SCBT, SidechainSyncInfo, SidechainSyncInfoMessageSpec.type,
      SidechainBlock, SidechainHistory, SidechainMemoryPool]
      (networkControllerRef, nodeViewHolderRef,
       SidechainSyncInfoMessageSpec, settings.network, timeProvider,
       Map[ModifierTypeId, Serializer[_ <: NodeViewModifier]]() //TODO Must be specified
      ))

  override val swaggerConfig: String = ""

  //TODO additional initialization (see HybridApp)
}

object SidechainApp extends App {
  private val settingsFilename = args.headOption.getOrElse("settings.conf")
  new SidechainApp(settingsFilename).run()
}
*/