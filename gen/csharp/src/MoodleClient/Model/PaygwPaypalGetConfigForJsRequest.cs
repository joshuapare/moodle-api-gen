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
using OpenAPIDateConverter = MoodleClient.Client.OpenAPIDateConverter;

namespace MoodleClient.Model
{
    /// <summary>
    /// PaygwPaypalGetConfigForJsRequest
    /// </summary>
    [DataContract(Name = "paygw_paypal_get_config_for_js_request")]
    public partial class PaygwPaypalGetConfigForJsRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="PaygwPaypalGetConfigForJsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected PaygwPaypalGetConfigForJsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="PaygwPaypalGetConfigForJsRequest" /> class.
        /// </summary>
        /// <param name="component">Component (required).</param>
        /// <param name="itemid">An identifier for payment area in the component (required).</param>
        /// <param name="paymentarea">Payment area in the component (required).</param>
        public PaygwPaypalGetConfigForJsRequest(string component = default(string), int itemid = default(int), string paymentarea = default(string))
        {
            // to ensure "component" is required (not null)
            if (component == null)
            {
                throw new ArgumentNullException("component is a required property for PaygwPaypalGetConfigForJsRequest and cannot be null");
            }
            this.Component = component;
            this.Itemid = itemid;
            // to ensure "paymentarea" is required (not null)
            if (paymentarea == null)
            {
                throw new ArgumentNullException("paymentarea is a required property for PaygwPaypalGetConfigForJsRequest and cannot be null");
            }
            this.Paymentarea = paymentarea;
        }

        /// <summary>
        /// Component
        /// </summary>
        /// <value>Component</value>
        [DataMember(Name = "component", IsRequired = true, EmitDefaultValue = true)]
        public string Component { get; set; }

        /// <summary>
        /// An identifier for payment area in the component
        /// </summary>
        /// <value>An identifier for payment area in the component</value>
        [DataMember(Name = "itemid", IsRequired = true, EmitDefaultValue = true)]
        public int Itemid { get; set; }

        /// <summary>
        /// Payment area in the component
        /// </summary>
        /// <value>Payment area in the component</value>
        [DataMember(Name = "paymentarea", IsRequired = true, EmitDefaultValue = true)]
        public string Paymentarea { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class PaygwPaypalGetConfigForJsRequest {\n");
            sb.Append("  Component: ").Append(Component).Append("\n");
            sb.Append("  Itemid: ").Append(Itemid).Append("\n");
            sb.Append("  Paymentarea: ").Append(Paymentarea).Append("\n");
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
