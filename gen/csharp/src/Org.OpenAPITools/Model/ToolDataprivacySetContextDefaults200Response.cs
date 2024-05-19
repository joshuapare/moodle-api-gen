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
    /// ToolDataprivacySetContextDefaults200Response
    /// </summary>
    [DataContract(Name = "tool_dataprivacy_set_context_defaults_200_response")]
    public partial class ToolDataprivacySetContextDefaults200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacySetContextDefaults200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ToolDataprivacySetContextDefaults200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ToolDataprivacySetContextDefaults200Response" /> class.
        /// </summary>
        /// <param name="result">Whether the context defaults were successfully set or not (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ToolDataprivacySetContextDefaults200Response(bool result = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Result = result;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Whether the context defaults were successfully set or not
        /// </summary>
        /// <value>Whether the context defaults were successfully set or not</value>
        [DataMember(Name = "result", IsRequired = true, EmitDefaultValue = true)]
        public bool Result { get; set; }

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
            sb.Append("class ToolDataprivacySetContextDefaults200Response {\n");
            sb.Append("  Result: ").Append(Result).Append("\n");
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
