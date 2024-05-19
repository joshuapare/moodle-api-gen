# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.tool_lp_data_for_plan_page200_response_competencies_inner import ToolLpDataForPlanPage200ResponseCompetenciesInner

class TestToolLpDataForPlanPage200ResponseCompetenciesInner(unittest.TestCase):
    """ToolLpDataForPlanPage200ResponseCompetenciesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ToolLpDataForPlanPage200ResponseCompetenciesInner:
        """Test ToolLpDataForPlanPage200ResponseCompetenciesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ToolLpDataForPlanPage200ResponseCompetenciesInner`
        """
        model = ToolLpDataForPlanPage200ResponseCompetenciesInner()
        if include_optional:
            return ToolLpDataForPlanPage200ResponseCompetenciesInner(
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
                usercompetency = openapi_client.models.tool_lp_data_for_plan_page_200_response_competencies_inner_usercompetency.tool_lp_data_for_plan_page_200_response_competencies_inner_usercompetency(
                    canrequestreview = True, 
                    canreview = True, 
                    competencyid = 56, 
                    grade = 56, 
                    gradename = '', 
                    id = 56, 
                    iscancelreviewrequestallowed = True, 
                    isrequestreviewallowed = True, 
                    isstartreviewallowed = True, 
                    isstatusidle = True, 
                    isstatusinreview = True, 
                    isstatuswaitingforreview = True, 
                    isstopreviewallowed = True, 
                    proficiency = True, 
                    proficiencyname = '', 
                    reviewer = openapi_client.models.core_competency_grade_competency_200_response_actionuser.core_competency_grade_competency_200_response_actionuser(
                        department = '', 
                        email = '', 
                        fullname = '', 
                        id = 56, 
                        identity = '', 
                        idnumber = '', 
                        institution = '', 
                        phone1 = '', 
                        phone2 = '', 
                        profileimageurl = '', 
                        profileimageurlsmall = '', 
                        profileurl = '', ), 
                    reviewerid = 56, 
                    status = 56, 
                    statusname = '', 
                    timecreated = 56, 
                    timemodified = 56, 
                    url = '', 
                    userid = 56, 
                    usermodified = 56, ),
                usercompetencyplan = openapi_client.models.tool_lp_data_for_plan_page_200_response_competencies_inner_usercompetencyplan.tool_lp_data_for_plan_page_200_response_competencies_inner_usercompetencyplan(
                    competencyid = 56, 
                    grade = 56, 
                    gradename = '', 
                    id = 56, 
                    planid = 56, 
                    proficiency = True, 
                    proficiencyname = '', 
                    sortorder = 56, 
                    timecreated = 56, 
                    timemodified = 56, 
                    userid = 56, 
                    usermodified = 56, )
            )
        else:
            return ToolLpDataForPlanPage200ResponseCompetenciesInner(
        )
        """

    def testToolLpDataForPlanPage200ResponseCompetenciesInner(self):
        """Test ToolLpDataForPlanPage200ResponseCompetenciesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
