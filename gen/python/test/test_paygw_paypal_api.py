# coding: utf-8

"""
    Moodle Webservice API

    Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.

    The version of the OpenAPI document: 4.3.4
    Generated by OpenAPI Generator (https://openapi-generator.tech)

    Do not edit the class manually.
"""  # noqa: E501


import unittest

from openapi_client.api.paygw_paypal_api import PaygwPaypalApi


class TestPaygwPaypalApi(unittest.TestCase):
    """PaygwPaypalApi unit test stubs"""

    def setUp(self) -> None:
        self.api = PaygwPaypalApi()

    def tearDown(self) -> None:
        pass

    def test_paygw_paypal_create_transaction_complete(self) -> None:
        """Test case for paygw_paypal_create_transaction_complete

        Takes care of what needs to be done when a PayPal transaction comes back as complete.
        """
        pass

    def test_paygw_paypal_get_config_for_js(self) -> None:
        """Test case for paygw_paypal_get_config_for_js

        Returns the configuration settings to be used in js
        """
        pass


if __name__ == '__main__':
    unittest.main()