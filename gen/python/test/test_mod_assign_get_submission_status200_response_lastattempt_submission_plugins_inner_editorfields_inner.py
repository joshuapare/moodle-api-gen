# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.mod_assign_get_submission_status200_response_lastattempt_submission_plugins_inner_editorfields_inner import ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner

class TestModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner(unittest.TestCase):
    """ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner:
        """Test ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner`
        """
        model = ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner()
        if include_optional:
            return ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner(
                description = '',
                format = 56,
                name = '',
                text = ''
            )
        else:
            return ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner(
        )
        """

    def testModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner(self):
        """Test ModAssignGetSubmissionStatus200ResponseLastattemptSubmissionPluginsInnerEditorfieldsInner"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
