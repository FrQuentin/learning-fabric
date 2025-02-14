package fr.quentin.learning.village;

import fr.quentin.learning.item.ModItems;
import net.fabricmc.fabric.api.object.builder.v1.trade.TradeOfferHelper;
import net.minecraft.village.TradeOffers;
import net.minecraft.village.VillagerProfession;

public class ModTradeOffers {
    public static void register() {
        TradeOfferHelper.registerVillagerOffers(VillagerProfession.FARMER, 1, factories -> {
            factories.add(new TradeOffers.BuyItemFactory(ModItems.CHILLI, 20, 16, 2));
        });
        TradeOfferHelper.registerWanderingTraderOffers(1, factories -> {
            factories.add(new TradeOffers.SellItemFactory(
                    ModItems.CHILLI_SEEDS, 1, 1, 12, 1)
            );
        });
    }
}
