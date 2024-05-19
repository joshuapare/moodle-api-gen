# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_lp_data_for_template_competencies_page200_response import ToolLpDataForTemplateCompetenciesPage200Response

class TestToolLpDataForTemplateCompetenciesPage200Response(unittest.TestCase):
    """ToolLpDataForTemplateCompetenciesPage200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolLpDataForTemplateCompetenciesPage200Response:
        """Test ToolLpDataForTemplateCompetenciesPage200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolLpDataForTemplateCompetenciesPage200Response`
        """
        model = ToolLpDataForTemplateCompetenciesPage200Response()
        if include_optional:
            return ToolLpDataForTemplateCompetenciesPage200Response(
                canmanagecompetencyframeworks = True,
                canmanagetemplatecompetencies = True,
                competencies = [
                    openapi_client.models.tool_lp_data_for_template_competencies_page_200_response_competencies_inner.tool_lp_data_for_template_competencies_page_200_response_competencies_inner(
                        competency = openapi_client.models.core_competency_create_competency_200_response.core_competency_create_competency_200_response(
                            competencyframeworkid = 56, 
                            description = '', 
                            descriptionformat = 56, 
                            id = 56, 
                            idnumber = '', 
                            parentid = 56, 
                            path = '/0/', 
                            ruleconfig = '', 
                            ruleoutcome = 56, 
                            ruletype = '', 
                            scaleconfiguration = '', 
                            scaleid = 56, 
                            shortname = '', 
                            sortorder = 56, 
                            timecreated = 56, 
                            timemodified = 56, 
                            usermodified = 56, ), 
                        comppath = openapi_client.models.tool_lp_data_for_competency_summary_200_response_comppath.tool_lp_data_for_competency_summary_200_response_comppath(
                            ancestors = [
                                openapi_client.models.tool_lp_data_for_competency_summary_200_response_comppath_ancestors_inner.tool_lp_data_for_competency_summary_200_response_comppath_ancestors_inner(
                                    first = True, 
                                    id = 56, 
                                    last = True, 
                                    name = '', 
                                    position = 56, )
                                ], 
                            framework = openapi_client.models.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath_framework.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath_framework(
                                first = True, 
                                id = 56, 
                                last = True, 
                                name = '', 
                                position = 56, ), 
                            pagecontextid = 56, 
                            pluginbaseurl = '', 
                            showlinks = True, ), 
                        framework = openapi_client.models.core_competency_duplicate_competency_framework_200_response.core_competency_duplicate_competency_framework_200_response(
                            canmanage = True, 
                            competenciescount = 56, 
                            contextid = 56, 
                            contextname = '', 
                            contextnamenoprefix = '', 
                            description = '', 
                            descriptionformat = 56, 
                            id = 56, 
                            idnumber = '', 
                            scaleconfiguration = '', 
                            scaleid = 56, 
                            shortname = '', 
                            taxonomies = '', 
                            timecreated = 56, 
                            timemodified = 56, 
                            usermodified = 56, 
                            visible = True, ), 
                        hascourses = True, 
                        hasrelatedcompetencies = True, 
                        linkedcourses = [
                            openapi_client.models.core_course_get_enrolled_courses_by_timeline_classification_200_response_courses_inner.core_course_get_enrolled_courses_by_timeline_classification_200_response_courses_inner(
                                coursecategory = '', 
                                courseimage = '', 
                                enddate = 56, 
                                fullname = '', 
                                fullnamedisplay = '', 
                                hasprogress = True, 
                                hidden = True, 
                                id = 56, 
                                idnumber = '', 
                                isfavourite = True, 
                                pdfexportfont = '', 
                                progress = 56, 
                                shortname = '', 
                                showactivitydates = True, 
                                showcompletionconditions = True, 
                                showshortname = True, 
                                startdate = 56, 
                                summary = '', 
                                summaryformat = 56, 
                                timeaccess = 56, 
                                viewurl = '', 
                                visible = True, )
                            ], 
                        pluginbaseurl = '', 
                        relatedcompetencies = [
                            openapi_client.models.core_competency_read_user_evidence_200_response_competencies_inner.core_competency_read_user_evidence_200_response_competencies_inner(
                                competencyframeworkid = 56, 
                                description = '', 
                                descriptionformat = 56, 
                                id = 56, 
                                idnumber = '', 
                                parentid = 56, 
                                path = '/0/', 
                                ruleconfig = '', 
                                ruleoutcome = 56, 
                                ruletype = '', 
                                scaleconfiguration = '', 
                                scaleid = 56, 
                                shortname = '', 
                                sortorder = 56, 
                                timecreated = 56, 
                                timemodified = 56, 
                                usermodified = 56, )
                            ], 
                        scaleconfiguration = '', 
                        scaleid = 56, 
                        taxonomyterm = '', )
                    ],
                manageurl = '',
                pagecontextid = 56,
                pluginbaseurl = 'null',
                statistics = openapi_client.models.tool_lp_data_for_template_competencies_page_200_response_statistics.tool_lp_data_for_template_competencies_page_200_response_statistics(
                    competencycount = 56, 
                    completedplancount = 56, 
                    completedplanpercentage = 1.337, 
                    completedplanpercentageformatted = 'null', 
                    leastproficient = [
                        openapi_client.models.core_competency_read_user_evidence_200_response_competencies_inner.core_competency_read_user_evidence_200_response_competencies_inner(
                            competencyframeworkid = 56, 
                            description = '', 
                            descriptionformat = 56, 
                            id = 56, 
                            idnumber = '', 
                            parentid = 56, 
                            path = '/0/', 
                            ruleconfig = '', 
                            ruleoutcome = 56, 
                            ruletype = '', 
                            scaleconfiguration = '', 
                            scaleid = 56, 
                            shortname = '', 
                            sortorder = 56, 
                            timecreated = 56, 
                            timemodified = 56, 
                            usermodified = 56, )
                        ], 
                    leastproficientcount = 56, 
                    linkedcompetencycount = 56, 
                    linkedcompetencypercentage = 1.337, 
                    linkedcompetencypercentageformatted = 'null', 
                    plancount = 56, 
                    proficientusercompetencyplancount = 56, 
                    proficientusercompetencyplanpercentage = 1.337, 
                    proficientusercompetencyplanpercentageformatted = 'null', 
                    unlinkedcompetencycount = 56, 
                    usercompetencyplancount = 56, ),
                template = openapi_client.models.core_competency_create_template_200_response.core_competency_create_template_200_response(
                    canmanage = True, 
                    canread = True, 
                    cohortscount = 56, 
                    contextid = 56, 
                    contextname = '', 
                    contextnamenoprefix = '', 
                    description = '', 
                    descriptionformat = 56, 
                    duedate = 56, 
                    duedateformatted = '', 
                    id = 56, 
                    planscount = 56, 
                    shortname = '', 
                    timecreated = 56, 
                    timemodified = 56, 
                    usermodified = 56, 
                    visible = True, )
            )
        else:
            return ToolLpDataForTemplateCompetenciesPage200Response(
                canmanagecompetencyframeworks = True,
                canmanagetemplatecompetencies = True,
                competencies = [
                    openapi_client.models.tool_lp_data_for_template_competencies_page_200_response_competencies_inner.tool_lp_data_for_template_competencies_page_200_response_competencies_inner(
                        competency = openapi_client.models.core_competency_create_competency_200_response.core_competency_create_competency_200_response(
                            competencyframeworkid = 56, 
                            description = '', 
                            descriptionformat = 56, 
                            id = 56, 
                            idnumber = '', 
                            parentid = 56, 
                            path = '/0/', 
                            ruleconfig = '', 
                            ruleoutcome = 56, 
                            ruletype = '', 
                            scaleconfiguration = '', 
                            scaleid = 56, 
                            shortname = '', 
                            sortorder = 56, 
                            timecreated = 56, 
                            timemodified = 56, 
                            usermodified = 56, ), 
                        comppath = openapi_client.models.tool_lp_data_for_competency_summary_200_response_comppath.tool_lp_data_for_competency_summary_200_response_comppath(
                            ancestors = [
                                openapi_client.models.tool_lp_data_for_competency_summary_200_response_comppath_ancestors_inner.tool_lp_data_for_competency_summary_200_response_comppath_ancestors_inner(
                                    first = True, 
                                    id = 56, 
                                    last = True, 
                                    name = '', 
                                    position = 56, )
                                ], 
                            framework = openapi_client.models.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath_framework.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath_framework(
                                first = True, 
                                id = 56, 
                                last = True, 
                                name = '', 
                                position = 56, ), 
                            pagecontextid = 56, 
                            pluginbaseurl = '', 
                            showlinks = True, ), 
                        framework = openapi_client.models.core_competency_duplicate_competency_framework_200_response.core_competency_duplicate_competency_framework_200_response(
                            canmanage = True, 
                            competenciescount = 56, 
                            contextid = 56, 
                            contextname = '', 
                            contextnamenoprefix = '', 
                            description = '', 
                            descriptionformat = 56, 
                            id = 56, 
                            idnumber = '', 
                            scaleconfiguration = '', 
                            scaleid = 56, 
                            shortname = '', 
                            taxonomies = '', 
                            timecreated = 56, 
                            timemodified = 56, 
                            usermodified = 56, 
                            visible = True, ), 
                        hascourses = True, 
                        hasrelatedcompetencies = True, 
                        linkedcourses = [
                            openapi_client.models.core_course_get_enrolled_courses_by_timeline_classification_200_response_courses_inner.core_course_get_enrolled_courses_by_timeline_classification_200_response_courses_inner(
                                coursecategory = '', 
                                courseimage = '', 
                                enddate = 56, 
                                fullname = '', 
                                fullnamedisplay = '', 
                                hasprogress = True, 
                                hidden = True, 
                                id = 56, 
                                idnumber = '', 
                                isfavourite = True, 
                                pdfexportfont = '', 
                                progress = 56, 
                                shortname = '', 
                                showactivitydates = True, 
                                showcompletionconditions = True, 
                                showshortname = True, 
                                startdate = 56, 
                                summary = '', 
                                summaryformat = 56, 
                                timeaccess = 56, 
                                viewurl = '', 
                                visible = True, )
                            ], 
                        pluginbaseurl = '', 
                        relatedcompetencies = [
                            openapi_client.models.core_competency_read_user_evidence_200_response_competencies_inner.core_competency_read_user_evidence_200_response_competencies_inner(
                                competencyframeworkid = 56, 
                                description = '', 
                                descriptionformat = 56, 
                                id = 56, 
                                idnumber = '', 
                                parentid = 56, 
                                path = '/0/', 
                                ruleconfig = '', 
                                ruleoutcome = 56, 
                                ruletype = '', 
                                scaleconfiguration = '', 
                                scaleid = 56, 
                                shortname = '', 
                                sortorder = 56, 
                                timecreated = 56, 
                                timemodified = 56, 
                                usermodified = 56, )
                            ], 
                        scaleconfiguration = '', 
                        scaleid = 56, 
                        taxonomyterm = '', )
                    ],
                manageurl = '',
                pagecontextid = 56,
                pluginbaseurl = 'null',
                statistics = openapi_client.models.tool_lp_data_for_template_competencies_page_200_response_statistics.tool_lp_data_for_template_competencies_page_200_response_statistics(
                    competencycount = 56, 
                    completedplancount = 56, 
                    completedplanpercentage = 1.337, 
                    completedplanpercentageformatted = 'null', 
                    leastproficient = [
                        openapi_client.models.core_competency_read_user_evidence_200_response_competencies_inner.core_competency_read_user_evidence_200_response_competencies_inner(
                            competencyframeworkid = 56, 
                            description = '', 
                            descriptionformat = 56, 
                            id = 56, 
                            idnumber = '', 
                            parentid = 56, 
                            path = '/0/', 
                            ruleconfig = '', 
                            ruleoutcome = 56, 
                            ruletype = '', 
                            scaleconfiguration = '', 
                            scaleid = 56, 
                            shortname = '', 
                            sortorder = 56, 
                            timecreated = 56, 
                            timemodified = 56, 
                            usermodified = 56, )
                        ], 
                    leastproficientcount = 56, 
                    linkedcompetencycount = 56, 
                    linkedcompetencypercentage = 1.337, 
                    linkedcompetencypercentageformatted = 'null', 
                    plancount = 56, 
                    proficientusercompetencyplancount = 56, 
                    proficientusercompetencyplanpercentage = 1.337, 
                    proficientusercompetencyplanpercentageformatted = 'null', 
                    unlinkedcompetencycount = 56, 
                    usercompetencyplancount = 56, ),
                template = openapi_client.models.core_competency_create_template_200_response.core_competency_create_template_200_response(
                    canmanage = True, 
                    canread = True, 
                    cohortscount = 56, 
                    contextid = 56, 
                    contextname = '', 
                    contextnamenoprefix = '', 
                    description = '', 
                    descriptionformat = 56, 
                    duedate = 56, 
                    duedateformatted = '', 
                    id = 56, 
                    planscount = 56, 
                    shortname = '', 
                    timecreated = 56, 
                    timemodified = 56, 
                    usermodified = 56, 
                    visible = True, ),
        )
        """

    def testToolLpDataForTemplateCompetenciesPage200Response(self):
        """Test ToolLpDataForTemplateCompetenciesPage200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
