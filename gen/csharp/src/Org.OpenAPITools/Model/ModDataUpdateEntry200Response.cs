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
    /// ModDataUpdateEntry200Response
    /// </summary>
    [DataContract(Name = "mod_data_update_entry_200_response")]
    public partial class ModDataUpdateEntry200Response : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataUpdateEntry200Response" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModDataUpdateEntry200Response() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataUpdateEntry200Response" /> class.
        /// </summary>
        /// <param name="fieldnotifications">fieldnotifications (required).</param>
        /// <param name="generalnotifications">generalnotifications (required).</param>
        /// <param name="updated">True if the entry was successfully updated, false other wise. (required) (default to null).</param>
        /// <param name="warnings">warnings.</param>
        public ModDataUpdateEntry200Response(List<ModDataUpdateEntry200ResponseFieldnotificationsInner> fieldnotifications = default(List<ModDataUpdateEntry200ResponseFieldnotificationsInner>), List<Object> generalnotifications = default(List<Object>), bool updated = null, List<AuthEmailSignupUser200ResponseWarningsInner> warnings = default(List<AuthEmailSignupUser200ResponseWarningsInner>))
        {
            // to ensure "fieldnotifications" is required (not null)
            if (fieldnotifications == null)
            {
                throw new ArgumentNullException("fieldnotifications is a required property for ModDataUpdateEntry200Response and cannot be null");
            }
            this.Fieldnotifications = fieldnotifications;
            // to ensure "generalnotifications" is required (not null)
            if (generalnotifications == null)
            {
                throw new ArgumentNullException("generalnotifications is a required property for ModDataUpdateEntry200Response and cannot be null");
            }
            this.Generalnotifications = generalnotifications;
            this.Updated = updated;
            this.Warnings = warnings;
        }

        /// <summary>
        /// Gets or Sets Fieldnotifications
        /// </summary>
        [DataMember(Name = "fieldnotifications", IsRequired = true, EmitDefaultValue = true)]
        public List<ModDataUpdateEntry200ResponseFieldnotificationsInner> Fieldnotifications { get; set; }

        /// <summary>
        /// Gets or Sets Generalnotifications
        /// </summary>
        [DataMember(Name = "generalnotifications", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Generalnotifications { get; set; }

        /// <summary>
        /// True if the entry was successfully updated, false other wise.
        /// </summary>
        /// <value>True if the entry was successfully updated, false other wise.</value>
        [DataMember(Name = "updated", IsRequired = true, EmitDefaultValue = true)]
        public bool Updated { get; set; }

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
            sb.Append("class ModDataUpdateEntry200Response {\n");
            sb.Append("  Fieldnotifications: ").Append(Fieldnotifications).Append("\n");
            sb.Append("  Generalnotifications: ").Append(Generalnotifications).Append("\n");
            sb.Append("  Updated: ").Append(Updated).Append("\n");
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