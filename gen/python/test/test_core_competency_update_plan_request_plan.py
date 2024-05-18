# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_competency_update_plan_request_plan import CoreCompetencyUpdatePlanRequestPlan

class TestCoreCompetencyUpdatePlanRequestPlan(unittest.TestCase):
    """CoreCompetencyUpdatePlanRequestPlan unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreCompetencyUpdatePlanRequestPlan:
        """Test CoreCompetencyUpdatePlanRequestPlan
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreCompetencyUpdatePlanRequestPlan`
        """
        model = CoreCompetencyUpdatePlanRequestPlan()
        if include_optional:
            return CoreCompetencyUpdatePlanRequestPlan(
                description = '',
                descriptionformat = 56,
                duedate = 56,
                id = 56,
                name = '',
                origtemplateid = 56,
                reviewerid = 56,
                status = 56,
                templateid = 56,
                timecreated = 56,
                timemodified = 56,
                userid = 56,
                usermodified = 56
            )
        else:
            return CoreCompetencyUpdatePlanRequestPlan(
                id = 56,
        )
        """

    def testCoreCompetencyUpdatePlanRequestPlan(self):
        """Test CoreCompetencyUpdatePlanRequestPlan"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
