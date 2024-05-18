# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_survey_get_questions200_response_questions_inner import ModSurveyGetQuestions200ResponseQuestionsInner

class TestModSurveyGetQuestions200ResponseQuestionsInner(unittest.TestCase):
    """ModSurveyGetQuestions200ResponseQuestionsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModSurveyGetQuestions200ResponseQuestionsInner:
        """Test ModSurveyGetQuestions200ResponseQuestionsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModSurveyGetQuestions200ResponseQuestionsInner`
        """
        model = ModSurveyGetQuestions200ResponseQuestionsInner()
        if include_optional:
            return ModSurveyGetQuestions200ResponseQuestionsInner(
                id = 56,
                intro = 'null',
                multi = 'null',
                options = 'null',
                parent = 56,
                shorttext = 'null',
                text = 'null',
                type = 56
            )
        else:
            return ModSurveyGetQuestions200ResponseQuestionsInner(
        )
        """

    def testModSurveyGetQuestions200ResponseQuestionsInner(self):
        """Test ModSurveyGetQuestions200ResponseQuestionsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()