# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.models.core_message_message_processor_config_form_request import CoreMessageMessageProcessorConfigFormRequest

class TestCoreMessageMessageProcessorConfigFormRequest(unittest.TestCase):
    """CoreMessageMessageProcessorConfigFormRequest unit test stubs"""

    def setUp(self):
        pass

    def tearDown(self):
        pass

    def make_instance(self, include_optional) -> CoreMessageMessageProcessorConfigFormRequest:
        """Test CoreMessageMessageProcessorConfigFormRequest
            include_option is a boolean, when False only required
            params are included, when True both required and
            optional params are included """
        # uncomment below to create an instance of `CoreMessageMessageProcessorConfigFormRequest`
        """
        model = CoreMessageMessageProcessorConfigFormRequest()
        if include_optional:
            return CoreMessageMessageProcessorConfigFormRequest(
                formvalues = [
                    openapi_client.models.core_message_message_processor_config_form_request_formvalues_inner.core_message_message_processor_config_form_request_formvalues_inner(
                        name = 'null', 
                        value = 'null', )
                    ],
                name = '',
                userid = 56
            )
        else:
            return CoreMessageMessageProcessorConfigFormRequest(
                formvalues = [
                    openapi_client.models.core_message_message_processor_config_form_request_formvalues_inner.core_message_message_processor_config_form_request_formvalues_inner(
                        name = 'null', 
                        value = 'null', )
                    ],
                name = '',
                userid = 56,
        )
        """

    def testCoreMessageMessageProcessorConfigFormRequest(self):
        """Test CoreMessageMessageProcessorConfigFormRequest"""
        # inst_req_only = self.make_instance(include_optional=False)
        # inst_req_and_optional = self.make_instance(include_optional=True)

if __name__ == '__main__':
    unittest.main()
