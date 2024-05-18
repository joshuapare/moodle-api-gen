# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_lesson_get_user_attempt200_response_answerpages_inner_answerdata import ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata

class TestModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata(unittest.TestCase):
    """ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata:
        """Test ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata`
        """
        model = ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata()
        if include_optional:
            return ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata(
                answers = [
                    None
                    ],
                response = 'null',
                responseformat = 56,
                score = 'null'
            )
        else:
            return ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata(
                response = 'null',
                responseformat = 56,
                score = 'null',
        )
        """

    def testModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata(self):
        """Test ModLessonGetUserAttempt200ResponseAnswerpagesInnerAnswerdata"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()