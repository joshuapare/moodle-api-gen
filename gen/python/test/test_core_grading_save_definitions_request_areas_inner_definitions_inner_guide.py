# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_guide import CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide

class TestCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide(unittest.TestCase):
    """CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide:
        """Test CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide`
        """
        model = CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide()
        if include_optional:
            return CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide(
                guide_comments = [
                    openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_comments_inner.core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_comments_inner(
                        description = '', 
                        descriptionformat = 56, 
                        id = 56, 
                        sortorder = 56, )
                    ],
                guide_criteria = [
                    openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner.core_grading_save_definitions_request_areas_inner_definitions_inner_guide_guide_criteria_inner(
                        description = '', 
                        descriptionformat = 56, 
                        descriptionmarkers = '', 
                        descriptionmarkersformat = 56, 
                        id = 56, 
                        maxscore = 1.337, 
                        shortname = '', 
                        sortorder = 56, )
                    ]
            )
        else:
            return CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide(
        )
        """

    def testCoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide(self):
        """Test CoreGradingSaveDefinitionsRequestAreasInnerDefinitionsInnerGuide"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()