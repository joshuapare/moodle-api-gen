# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.report_competency_data_for_report200_response_usercompetencies_inner import ReportCompetencyDataForReport200ResponseUsercompetenciesInner

class TestReportCompetencyDataForReport200ResponseUsercompetenciesInner(unittest.TestCase):
    """ReportCompetencyDataForReport200ResponseUsercompetenciesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ReportCompetencyDataForReport200ResponseUsercompetenciesInner:
        """Test ReportCompetencyDataForReport200ResponseUsercompetenciesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ReportCompetencyDataForReport200ResponseUsercompetenciesInner`
        """
        model = ReportCompetencyDataForReport200ResponseUsercompetenciesInner()
        if include_optional:
            return ReportCompetencyDataForReport200ResponseUsercompetenciesInner(
                competency = openapi_client.models.report_competency_data_for_report_200_response_usercompetencies_inner_competency.report_competency_data_for_report_200_response_usercompetencies_inner_competency(
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
                    comppath = openapi_client.models.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath(
                        ancestors = [
                            openapi_client.models.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath_ancestors_inner.report_competency_data_for_report_200_response_usercompetencies_inner_competency_comppath_ancestors_inner(
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
                        pluginbaseurl = 'null', 
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
                    taxonomyterm = 'null', ),
                usercompetencycourse = openapi_client.models.report_competency_data_for_report_200_response_usercompetencies_inner_usercompetencycourse.report_competency_data_for_report_200_response_usercompetencies_inner_usercompetencycourse(
                    competencyid = 56, 
                    courseid = 56, 
                    grade = 56, 
                    gradename = '', 
                    id = 56, 
                    proficiency = True, 
                    proficiencyname = 'null', 
                    timecreated = 56, 
                    timemodified = 56, 
                    userid = 56, 
                    usermodified = 56, )
            )
        else:
            return ReportCompetencyDataForReport200ResponseUsercompetenciesInner(
        )
        """

    def testReportCompetencyDataForReport200ResponseUsercompetenciesInner(self):
        """Test ReportCompetencyDataForReport200ResponseUsercompetenciesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
