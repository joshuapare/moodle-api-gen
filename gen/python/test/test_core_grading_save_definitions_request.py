# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_grading_save_definitions_request import CoreGradingSaveDefinitionsRequest

class TestCoreGradingSaveDefinitionsRequest(unittest.TestCase):
    """CoreGradingSaveDefinitionsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreGradingSaveDefinitionsRequest:
        """Test CoreGradingSaveDefinitionsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreGradingSaveDefinitionsRequest`
        """
        model = CoreGradingSaveDefinitionsRequest()
        if include_optional:
            return CoreGradingSaveDefinitionsRequest(
                areas = [
                    openapi_client.models.core_grading_save_definitions_request_areas_inner.core_grading_save_definitions_request_areas_inner(
                        activemethod = '', 
                        areaname = '', 
                        cmid = 56, 
                        component = '', 
                        contextid = 56, 
                        definitions = [
                            openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner.core_grading_save_definitions_request_areas_inner_definitions_inner(
                                copiedfromid = 56, 
                                description = '', 
                                descriptionformat = 56, 
                                guide = openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_guide.core_grading_save_definitions_request_areas_inner_definitions_inner_guide(
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
                                        ], ), 
                                id = 56, 
                                method = '', 
                                name = '', 
                                rubric = openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric(
                                    rubric_criteria = [
                                        openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner(
                                            description = '', 
                                            descriptionformat = 56, 
                                            id = 56, 
                                            levels = [
                                                openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_levels_inner.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_levels_inner(
                                                    definition = '', 
                                                    definitionformat = 56, 
                                                    id = 56, 
                                                    score = 1.337, )
                                                ], 
                                            sortorder = 56, )
                                        ], ), 
                                status = 56, 
                                timecopied = 56, 
                                timecreated = 56, 
                                timemodified = 56, 
                                usercreated = 56, 
                                usermodified = 56, )
                            ], )
                    ]
            )
        else:
            return CoreGradingSaveDefinitionsRequest(
                areas = [
                    openapi_client.models.core_grading_save_definitions_request_areas_inner.core_grading_save_definitions_request_areas_inner(
                        activemethod = '', 
                        areaname = '', 
                        cmid = 56, 
                        component = '', 
                        contextid = 56, 
                        definitions = [
                            openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner.core_grading_save_definitions_request_areas_inner_definitions_inner(
                                copiedfromid = 56, 
                                description = '', 
                                descriptionformat = 56, 
                                guide = openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_guide.core_grading_save_definitions_request_areas_inner_definitions_inner_guide(
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
                                        ], ), 
                                id = 56, 
                                method = '', 
                                name = '', 
                                rubric = openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric(
                                    rubric_criteria = [
                                        openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner(
                                            description = '', 
                                            descriptionformat = 56, 
                                            id = 56, 
                                            levels = [
                                                openapi_client.models.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_levels_inner.core_grading_save_definitions_request_areas_inner_definitions_inner_rubric_rubric_criteria_inner_levels_inner(
                                                    definition = '', 
                                                    definitionformat = 56, 
                                                    id = 56, 
                                                    score = 1.337, )
                                                ], 
                                            sortorder = 56, )
                                        ], ), 
                                status = 56, 
                                timecopied = 56, 
                                timecreated = 56, 
                                timemodified = 56, 
                                usercreated = 56, 
                                usermodified = 56, )
                            ], )
                    ],
        )
        """

    def testCoreGradingSaveDefinitionsRequest(self):
        """Test CoreGradingSaveDefinitionsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
