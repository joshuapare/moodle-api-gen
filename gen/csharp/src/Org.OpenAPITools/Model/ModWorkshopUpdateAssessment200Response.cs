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
    /// ModWorkshopUpdateAssessment200Response
    /// </summary>
    [DataContract(Name = "mod_workshop_update_assessment_200_response")]
    public partial class ModWorkshopUpdateAssessment200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopUpdateAssessment200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModWorkshopUpdateAssessment200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModWorkshopUpdateAssessment200Response" /> class.
        /// </summary>
        /// <param name="rawgrade">Raw percentual grade (0.00000 to 100.00000) for submission. (default to nullM).</param>
        /// <param name="status">status: true if the assessment was added or updated false otherwise. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModWorkshopUpdateAssessment200Response(decimal rawgrade = nullM, bool status = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            this.Status = status;
            this.Rawgrade = rawgrade;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Raw percentual grade (0.00000 to 100.00000) for submission.
        /// </summary>
        /// <value>Raw percentual grade (0.00000 to 100.00000) for submission.</value>
        [DataMember(Name = "rawgrade", EmitDefaultValue = false)]
        public decimal Rawgrade { get; set; }

        /// <summary>
        /// status: true if the assessment was added or updated false otherwise.
        /// </summary>
        /// <value>status: true if the assessment was added or updated false otherwise.</value>
        [DataMember(Name = "status", IsRequired = true, EmitDefaultValue = true)]
        public bool Status { get; set; }

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
            sb.Append("class ModWorkshopUpdateAssessment200Response {\n");
            sb.Append("  Rawgrade: ").Append(Rawgrade).Append("\n");
            sb.Append("  Status: ").Append(Status).Append("\n");
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
