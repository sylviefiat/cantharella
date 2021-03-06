/*
 * #%L
 * Cantharella :: Data
 * $Id: LotPersonneDroitsComp.java 269 2014-05-07 08:14:00Z echatellier $
 * $HeadURL: https://svn.codelutin.com/cantharella/trunk/cantharella.data/src/main/java/nc/ird/cantharella/data/model/comparators/LotPersonneDroitsComp.java $
 * %%
 * Copyright (C) 2009 - 2012 IRD (Institut de Recherche pour le Developpement) and by respective authors (see below)
 * %%
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * #L%
 */
package nc.ird.cantharella.data.model.comparators;

import java.util.Comparator;

import nc.ird.cantharella.data.model.LotPersonneDroits;

import org.apache.commons.beanutils.BeanComparator;
import org.apache.commons.collections.comparators.ComparatorChain;

/**
 * LotPersonneDroits comparator. Compare first on campagne, then lot.
 * 
 * @author Adrien Cheype
 */
public class LotPersonneDroitsComp implements Comparator<LotPersonneDroits> {

    /** {@inheritDoc} */
    @Override
    public int compare(LotPersonneDroits obj1, LotPersonneDroits obj2) {
        ComparatorChain comparatorChain = new ComparatorChain();
        comparatorChain.addComparator(new BeanComparator("id.pk1.campagne"));
        comparatorChain.addComparator(new BeanComparator("id.pk1"));
        return comparatorChain.compare(obj1, obj2);
    }
}
