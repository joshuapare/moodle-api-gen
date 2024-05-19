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
    /// ModDataDeleteSavedPresetRequest
    /// </summary>
    [DataContract(Name = "mod_data_delete_saved_preset_request")]
    public partial class ModDataDeleteSavedPresetRequest : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataDeleteSavedPresetRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected ModDataDeleteSavedPresetRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="ModDataDeleteSavedPresetRequest" /> class.
        /// </summary>
        /// <param name="dataid">Id of the data activity (required) (default to null).</param>
        /// <param name="presetnames">presetnames (required).</param>
        public ModDataDeleteSavedPresetRequest(int dataid = null, List<Object> presetnames = default(List<Object>))
        {
            this.Dataid = dataid;
            // to ensure "presetnames" is required (not null)
            if (presetnames == null)
            {
                throw new ArgumentNullException("presetnames is a required property for ModDataDeleteSavedPresetRequest and cannot be null");
            }
            this.Presetnames = presetnames;
        }

        /// <summary>
        /// Id of the data activity
        /// </summary>
        /// <value>Id of the data activity</value>
        [DataMember(Name = "dataid", IsRequired = true, EmitDefaultValue = true)]
        public int Dataid { get; set; }

        /// <summary>
        /// Gets or Sets Presetnames
        /// </summary>
        [DataMember(Name = "presetnames", IsRequired = true, EmitDefaultValue = true)]
        public List<Object> Presetnames { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModDataDeleteSavedPresetRequest {\n");
            sb.Append("  Dataid: ").Append(Dataid).Append("\n");
            sb.Append("  Presetnames: ").Append(Presetnames).Append("\n");
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