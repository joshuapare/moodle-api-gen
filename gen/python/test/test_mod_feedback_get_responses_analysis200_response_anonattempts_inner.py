# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_feedback_get_responses_analysis200_response_anonattempts_inner import ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner

class TestModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner(unittest.TestCase):
    """ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner:
        """Test ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner`
        """
        model = ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner()
        if include_optional:
            return ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner(
                courseid = 56,
                id = 56,
                number = 56,
                responses = [
                    openapi_client.models.mod_feedback_get_responses_analysis_200_response_anonattempts_inner_responses_inner.mod_feedback_get_responses_analysis_200_response_anonattempts_inner_responses_inner(
                        id = 56, 
                        name = 'null', 
                        printval = 'null', 
                        rawval = 'null', )
                    ]
            )
        else:
            return ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner(
        )
        """

    def testModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner(self):
        """Test ModFeedbackGetResponsesAnalysis200ResponseAnonattemptsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
