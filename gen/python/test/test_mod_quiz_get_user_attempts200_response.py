# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_quiz_get_user_attempts200_response import ModQuizGetUserAttempts200Response

class TestModQuizGetUserAttempts200Response(unittest.TestCase):
    """ModQuizGetUserAttempts200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModQuizGetUserAttempts200Response:
        """Test ModQuizGetUserAttempts200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModQuizGetUserAttempts200Response`
        """
        model = ModQuizGetUserAttempts200Response()
        if include_optional:
            return ModQuizGetUserAttempts200Response(
                attempts = [
                    openapi_client.models.mod_quiz_get_user_attempts_200_response_attempts_inner.mod_quiz_get_user_attempts_200_response_attempts_inner(
                        attempt = 56, 
                        currentpage = 56, 
                        gradednotificationsenttime = 56, 
                        id = 56, 
                        layout = '', 
                        preview = 56, 
                        quiz = 56, 
                        state = '', 
                        sumgrades = 1.337, 
                        timecheckstate = 56, 
                        timefinish = 56, 
                        timemodified = 56, 
                        timemodifiedoffline = 56, 
                        timestart = 56, 
                        uniqueid = 56, 
                        userid = 56, )
                    ],
                warnings = [
                    openapi_client.models.auth_email_signup_user_200_response_warnings_inner.auth_email_signup_user_200_response_warnings_inner(
                        item = '', 
                        itemid = 56, 
                        message = '', 
                        warningcode = '', )
                    ]
            )
        else:
            return ModQuizGetUserAttempts200Response(
                attempts = [
                    openapi_client.models.mod_quiz_get_user_attempts_200_response_attempts_inner.mod_quiz_get_user_attempts_200_response_attempts_inner(
                        attempt = 56, 
                        currentpage = 56, 
                        gradednotificationsenttime = 56, 
                        id = 56, 
                        layout = '', 
                        preview = 56, 
                        quiz = 56, 
                        state = '', 
                        sumgrades = 1.337, 
                        timecheckstate = 56, 
                        timefinish = 56, 
                        timemodified = 56, 
                        timemodifiedoffline = 56, 
                        timestart = 56, 
                        uniqueid = 56, 
                        userid = 56, )
                    ],
        )
        """

    def testModQuizGetUserAttempts200Response(self):
        """Test ModQuizGetUserAttempts200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
