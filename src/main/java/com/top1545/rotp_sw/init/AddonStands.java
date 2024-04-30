package com.top1545.rotp_sw.init;

import com.top1545.rotp_sw.entity.stand.stands.SoftAndWetEntity;
import com.github.standobyte.jojo.entity.stand.StandEntityType;
import com.github.standobyte.jojo.init.power.stand.EntityStandRegistryObject.EntityStandSupplier;
import com.github.standobyte.jojo.power.impl.stand.stats.StandStats;
import com.github.standobyte.jojo.power.impl.stand.type.EntityStandType;

public class AddonStands {

    public static final EntityStandSupplier<EntityStandType<StandStats>, StandEntityType<SoftAndWetEntity>>
            SOFT_AND_WET = new EntityStandSupplier<>(InitStands.STAND_SOFT_AND_WET);
}
