# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_workshop_get_assessment_form_definition200_response_current_inner import ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner

class TestModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner(unittest.TestCase):
    """ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner:
        """Test ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner`
        """
        model = ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner()
        if include_optional:
            return ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner(
                name = 'null',
                value = 'null'
            )
        else:
            return ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner(
        )
        """

    def testModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner(self):
        """Test ModWorkshopGetAssessmentFormDefinition200ResponseCurrentInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
