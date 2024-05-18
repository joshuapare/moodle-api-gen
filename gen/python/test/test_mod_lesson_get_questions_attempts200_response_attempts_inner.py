# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_lesson_get_questions_attempts200_response_attempts_inner import ModLessonGetQuestionsAttempts200ResponseAttemptsInner

class TestModLessonGetQuestionsAttempts200ResponseAttemptsInner(unittest.TestCase):
    """ModLessonGetQuestionsAttempts200ResponseAttemptsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModLessonGetQuestionsAttempts200ResponseAttemptsInner:
        """Test ModLessonGetQuestionsAttempts200ResponseAttemptsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModLessonGetQuestionsAttempts200ResponseAttemptsInner`
        """
        model = ModLessonGetQuestionsAttempts200ResponseAttemptsInner()
        if include_optional:
            return ModLessonGetQuestionsAttempts200ResponseAttemptsInner(
                answerid = 56,
                correct = 56,
                id = 56,
                lessonid = 56,
                pageid = 56,
                retry = 56,
                timeseen = 56,
                useranswer = 'null',
                userid = 56
            )
        else:
            return ModLessonGetQuestionsAttempts200ResponseAttemptsInner(
        )
        """

    def testModLessonGetQuestionsAttempts200ResponseAttemptsInner(self):
        """Test ModLessonGetQuestionsAttempts200ResponseAttemptsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()