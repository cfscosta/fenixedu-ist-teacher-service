/**
 * Copyright © 2011 Instituto Superior Técnico
 *
 * This file is part of FenixEdu GIAF Contracts.
 *
 * FenixEdu GIAF Contracts is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * FenixEdu GIAF Contracts is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with FenixEdu GIAF Contracts.  If not, see <http://www.gnu.org/licenses/>.
 */
package pt.ist.fenixedu.contracts.domain.organizationalStructure;

import org.fenixedu.academic.domain.Person;
import org.joda.time.YearMonthDay;

public class ResearchTechnicalStaffContract extends ResearchTechnicalStaffContract_Base {

    public ResearchTechnicalStaffContract(Person person, YearMonthDay beginDate, YearMonthDay endDate, ResearchUnit unit,
            Boolean isExternalContract) {
        super();
        initResearchContract(person, beginDate, endDate, unit, isExternalContract);
    }
}
