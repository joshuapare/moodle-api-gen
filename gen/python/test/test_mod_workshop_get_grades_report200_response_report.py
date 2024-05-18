# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_workshop_get_grades_report200_response_report import ModWorkshopGetGradesReport200ResponseReport

class TestModWorkshopGetGradesReport200ResponseReport(unittest.TestCase):
    """ModWorkshopGetGradesReport200ResponseReport unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModWorkshopGetGradesReport200ResponseReport:
        """Test ModWorkshopGetGradesReport200ResponseReport
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModWorkshopGetGradesReport200ResponseReport`
        """
        model = ModWorkshopGetGradesReport200ResponseReport()
        if include_optional:
            return ModWorkshopGetGradesReport200ResponseReport(
                grades = [
                    openapi_client.models.mod_workshop_get_grades_report_200_response_report_grades_inner.mod_workshop_get_grades_report_200_response_report_grades_inner(
                        gradinggrade = 1.337, 
                        reviewedby = [
                            openapi_client.models.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewedby_inner.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewedby_inner(
                                assessmentid = 56, 
                                grade = 1.337, 
                                gradinggrade = 1.337, 
                                gradinggradeover = 1.337, 
                                submissionid = 56, 
                                userid = 56, 
                                weight = 56, )
                            ], 
                        reviewerof = [
                            openapi_client.models.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewerof_inner.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewerof_inner(
                                assessmentid = 56, 
                                grade = 1.337, 
                                gradinggrade = 1.337, 
                                gradinggradeover = 1.337, 
                                submissionid = 56, 
                                userid = 56, 
                                weight = 56, )
                            ], 
                        submissiongrade = 1.337, 
                        submissiongradeover = 1.337, 
                        submissiongradeoverby = 56, 
                        submissionid = 56, 
                        submissionmodified = 56, 
                        submissionpublished = 56, 
                        submissiontitle = 'null', 
                        userid = 56, )
                    ],
                totalcount = 56
            )
        else:
            return ModWorkshopGetGradesReport200ResponseReport(
                grades = [
                    openapi_client.models.mod_workshop_get_grades_report_200_response_report_grades_inner.mod_workshop_get_grades_report_200_response_report_grades_inner(
                        gradinggrade = 1.337, 
                        reviewedby = [
                            openapi_client.models.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewedby_inner.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewedby_inner(
                                assessmentid = 56, 
                                grade = 1.337, 
                                gradinggrade = 1.337, 
                                gradinggradeover = 1.337, 
                                submissionid = 56, 
                                userid = 56, 
                                weight = 56, )
                            ], 
                        reviewerof = [
                            openapi_client.models.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewerof_inner.mod_workshop_get_grades_report_200_response_report_grades_inner_reviewerof_inner(
                                assessmentid = 56, 
                                grade = 1.337, 
                                gradinggrade = 1.337, 
                                gradinggradeover = 1.337, 
                                submissionid = 56, 
                                userid = 56, 
                                weight = 56, )
                            ], 
                        submissiongrade = 1.337, 
                        submissiongradeover = 1.337, 
                        submissiongradeoverby = 56, 
                        submissionid = 56, 
                        submissionmodified = 56, 
                        submissionpublished = 56, 
                        submissiontitle = 'null', 
                        userid = 56, )
                    ],
                totalcount = 56,
        )
        """

    def testModWorkshopGetGradesReport200ResponseReport(self):
        """Test ModWorkshopGetGradesReport200ResponseReport"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
