# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_workshop_get_user_plan200_response_userplan_examples_inner import ModWorkshopGetUserPlan200ResponseUserplanExamplesInner

class TestModWorkshopGetUserPlan200ResponseUserplanExamplesInner(unittest.TestCase):
    """ModWorkshopGetUserPlan200ResponseUserplanExamplesInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModWorkshopGetUserPlan200ResponseUserplanExamplesInner:
        """Test ModWorkshopGetUserPlan200ResponseUserplanExamplesInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModWorkshopGetUserPlan200ResponseUserplanExamplesInner`
        """
        model = ModWorkshopGetUserPlan200ResponseUserplanExamplesInner()
        if include_optional:
            return ModWorkshopGetUserPlan200ResponseUserplanExamplesInner(
                assessmentid = 56,
                grade = 1.337,
                gradinggrade = 1.337,
                id = 56,
                title = 'null'
            )
        else:
            return ModWorkshopGetUserPlan200ResponseUserplanExamplesInner(
        )
        """

    def testModWorkshopGetUserPlan200ResponseUserplanExamplesInner(self):
        """Test ModWorkshopGetUserPlan200ResponseUserplanExamplesInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()