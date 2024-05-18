# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_feedback_get_unfinished_responses200_response import ModFeedbackGetUnfinishedResponses200Response

class TestModFeedbackGetUnfinishedResponses200Response(unittest.TestCase):
    """ModFeedbackGetUnfinishedResponses200Response unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModFeedbackGetUnfinishedResponses200Response:
        """Test ModFeedbackGetUnfinishedResponses200Response
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModFeedbackGetUnfinishedResponses200Response`
        """
        model = ModFeedbackGetUnfinishedResponses200Response()
        if include_optional:
            return ModFeedbackGetUnfinishedResponses200Response(
                responses = [
                    openapi_client.models.mod_feedback_get_unfinished_responses_200_response_responses_inner.mod_feedback_get_unfinished_responses_200_response_responses_inner(
                        completed = 56, 
                        course_id = 56, 
                        id = 56, 
                        item = 56, 
                        tmp_completed = 56, 
                        value = '', )
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
            return ModFeedbackGetUnfinishedResponses200Response(
                responses = [
                    openapi_client.models.mod_feedback_get_unfinished_responses_200_response_responses_inner.mod_feedback_get_unfinished_responses_200_response_responses_inner(
                        completed = 56, 
                        course_id = 56, 
                        id = 56, 
                        item = 56, 
                        tmp_completed = 56, 
                        value = '', )
                    ],
        )
        """

    def testModFeedbackGetUnfinishedResponses200Response(self):
        """Test ModFeedbackGetUnfinishedResponses200Response"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()