# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_feedback_get_non_respondents_request import ModFeedbackGetNonRespondentsRequest

class TestModFeedbackGetNonRespondentsRequest(unittest.TestCase):
    """ModFeedbackGetNonRespondentsRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModFeedbackGetNonRespondentsRequest:
        """Test ModFeedbackGetNonRespondentsRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModFeedbackGetNonRespondentsRequest`
        """
        model = ModFeedbackGetNonRespondentsRequest()
        if include_optional:
            return ModFeedbackGetNonRespondentsRequest(
                courseid = 56,
                feedbackid = 56,
                groupid = 56,
                page = 56,
                perpage = 56,
                sort = 'lastaccess'
            )
        else:
            return ModFeedbackGetNonRespondentsRequest(
                feedbackid = 56,
        )
        """

    def testModFeedbackGetNonRespondentsRequest(self):
        """Test ModFeedbackGetNonRespondentsRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()