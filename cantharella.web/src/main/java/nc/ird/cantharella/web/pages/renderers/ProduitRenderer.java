/*
 * #%L
 * Cantharella :: Web
 * $Id: ProduitRenderer.java 269 2014-05-07 08:14:00Z echatellier $
 * $HeadURL: https://svn.codelutin.com/cantharella/trunk/cantharella.web/src/main/java/nc/ird/cantharella/web/pages/renderers/ProduitRenderer.java $
 * %%
 * Copyright (C) 2009 - 2013 IRD (Institut de Recherche pour le Developpement) and by respective authors (see below)
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
package nc.ird.cantharella.web.pages.renderers;

import nc.ird.cantharella.data.model.Produit;

import org.apache.wicket.markup.html.form.ChoiceRenderer;

/**
 * Renderer to display Produit with product ref.
 * 
 * @author Eric Chatellier
 */
public class ProduitRenderer extends ChoiceRenderer<Produit> {

    /** {@inheritDoc} */
    @Override
    public Object getDisplayValue(final Produit produit) {
        return produit.getRef();
    }
}
