# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grades_grader_gradingpanel_point_fetch200_response_grade import CoreGradesGraderGradingpanelPointFetch200ResponseGrade

class TestCoreGradesGraderGradingpanelPointFetch200ResponseGrade(unittest.TestCase):
    """CoreGradesGraderGradingpanelPointFetch200ResponseGrade unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradesGraderGradingpanelPointFetch200ResponseGrade:
        """Test CoreGradesGraderGradingpanelPointFetch200ResponseGrade
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradesGraderGradingpanelPointFetch200ResponseGrade`
        """
        model = CoreGradesGraderGradingpanelPointFetch200ResponseGrade()
        if include_optional:
            return CoreGradesGraderGradingpanelPointFetch200ResponseGrade(
                grade = 1.337,
                gradedby = 'null',
                maxgrade = 'null',
                timecreated = 56,
                timemodified = 56,
                usergrade = 'null'
            )
        else:
            return CoreGradesGraderGradingpanelPointFetch200ResponseGrade(
                grade = 1.337,
                gradedby = 'null',
                maxgrade = 'null',
                timecreated = 56,
                timemodified = 56,
                usergrade = 'null',
        )
        """

    def testCoreGradesGraderGradingpanelPointFetch200ResponseGrade(self):
        """Test CoreGradesGraderGradingpanelPointFetch200ResponseGrade"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()