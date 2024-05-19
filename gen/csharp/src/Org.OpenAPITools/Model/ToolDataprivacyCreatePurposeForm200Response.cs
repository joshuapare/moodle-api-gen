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
    /// ToolDataprivacyCreatePurposeForm200Response
    /// </summary>
    [DataContract(Name = "tool_dataprivacy_create_purpose_form_200_response")]
    public partial class ToolDataprivacyCreatePurposeForm200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacyCreatePurposeForm200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolDataprivacyCreatePurposeForm200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacyCreatePurposeForm200Response" /> class.
        /// </summary>
        /// <param name="purpose">purpose (required).</param>
        /// <param name="validationerrors">Were there validation errors (required).</param>
        /// <param name="warnings">warnings.</param>
        public ToolDataprivacyCreatePurposeForm200Response(ToolDataprivacyCreatePurposeForm200ResponsePurpose purpose = default(ToolDataprivacyCreatePurposeForm200ResponsePurpose), bool validationerrors = default(bool), List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "purpose" is required (not null)
            if (purpose == null)
            {
                throw new ArgumentNullException("purpose is a required property for ToolDataprivacyCreatePurposeForm200Response and cannot be null");
            }
            this.Purpose = purpose;
            this.Validationerrors = validationerrors;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Purpose
        /// </summary>
        [DataMember(Name = "purpose", IsRequired = true, EmitDefaultValue = true)]
        public ToolDataprivacyCreatePurposeForm200ResponsePurpose Purpose { get; set; }

        /// <summary>
        /// Were there validation errors
        /// </summary>
        /// <value>Were there validation errors</value>
        [DataMember(Name = "validationerrors", IsRequired = true, EmitDefaultValue = true)]
        public bool Validationerrors { get; set; }

        /// <summary>
        /// Gets or Sets Warnings
        /// </summary>
        [DataMember(Name = "warnings", EmitDefaultValue = false)]
        public List<AuthEmailSignupUser200ResponseWarningsInner> Warnings { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ToolDataprivacyCreatePurposeForm200Response {\n");
            sb.Append("  Purpose: ").Append(Purpose).Append("\n");
            sb.Append("  Validationerrors: ").Append(Validationerrors).Append("\n");
            sb.Append("  Warnings: ").Append(Warnings).Append("\n");
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
