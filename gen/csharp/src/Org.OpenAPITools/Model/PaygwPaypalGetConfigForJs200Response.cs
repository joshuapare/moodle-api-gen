/*
 * Moodle Webservice API
 *
 * Auto-generated OpenAPI spec for Moodle's Webservice API. Requires installation of the Catalyst RESTful API plugin: https://github.com/catalyst/moodle-webservice_restful.
 *
 * The version of the OpenAPI document: 4.3.4
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// PaygwPaypalGetConfigForJs200Response
    /// </summary>
    [DataContract(Name = "paygw_paypal_get_config_for_js_200_response")]
    public partial class PaygwPaypalGetConfigForJs200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaygwPaypalGetConfigForJs200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PaygwPaypalGetConfigForJs200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PaygwPaypalGetConfigForJs200Response" /> class.
        /// </summary>
        /// <param name="brandname">Brand name (required) (default to &quot;null&quot;).</param>
        /// <param name="clientid">PayPal client ID (required) (default to &quot;null&quot;).</param>
        /// <param name="cost">Cost with gateway surcharge (required) (default to nullM).</param>
        /// <param name="currency">Currency (required) (default to &quot;null&quot;).</param>
        public PaygwPaypalGetConfigForJs200Response(string brandname = @"null", string clientid = @"null", decimal cost = nullM, string currency = @"null")
        {
            // to ensure "brandname" is required (not null)
            if (brandname == null)
            {
                throw new ArgumentNullException("brandname is a required property for PaygwPaypalGetConfigForJs200Response and cannot be null");
            }
            this.Brandname = brandname;
            // to ensure "clientid" is required (not null)
            if (clientid == null)
            {
                throw new ArgumentNullException("clientid is a required property for PaygwPaypalGetConfigForJs200Response and cannot be null");
            }
            this.Clientid = clientid;
            this.Cost = cost;
            // to ensure "currency" is required (not null)
            if (currency == null)
            {
                throw new ArgumentNullException("currency is a required property for PaygwPaypalGetConfigForJs200Response and cannot be null");
            }
            this.Currency = currency;
        }

        /// <summary>
        /// Brand name
        /// </summary>
        /// <value>Brand name</value>
        [DataMember(Name = "brandname", IsRequired = true, EmitDefaultValue = true)]
        public string Brandname { get; set; }

        /// <summary>
        /// PayPal client ID
        /// </summary>
        /// <value>PayPal client ID</value>
        [DataMember(Name = "clientid", IsRequired = true, EmitDefaultValue = true)]
        public string Clientid { get; set; }

        /// <summary>
        /// Cost with gateway surcharge
        /// </summary>
        /// <value>Cost with gateway surcharge</value>
        [DataMember(Name = "cost", IsRequired = true, EmitDefaultValue = true)]
        public decimal Cost { get; set; }

        /// <summary>
        /// Currency
        /// </summary>
        /// <value>Currency</value>
        [DataMember(Name = "currency", IsRequired = true, EmitDefaultValue = true)]
        public string Currency { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PaygwPaypalGetConfigForJs200Response {\n");
            sb.Append("  Brandname: ").Append(Brandname).Append("\n");
            sb.Append("  Clientid: ").Append(Clientid).Append("\n");
            sb.Append("  Cost: ").Append(Cost).Append("\n");
            sb.Append("  Currency: ").Append(Currency).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
