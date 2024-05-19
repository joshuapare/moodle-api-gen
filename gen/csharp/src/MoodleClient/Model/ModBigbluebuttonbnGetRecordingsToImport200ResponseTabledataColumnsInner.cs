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
    /// ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner
    /// </summary>
    [DataContract(Name = "mod_bigbluebuttonbn_get_recordings_to_import_200_response_tabledata_columns_inner")]
    public partial class ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner : IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner" /> class.
        /// </summary>
        /// <param name="allowHTML">Whether this column contains HTML (default to false).</param>
        /// <param name="key">key.</param>
        /// <param name="label">label.</param>
        /// <param name="sortable">Whether this column is sortable (default to false).</param>
        /// <param name="type">Column type.</param>
        /// <param name="width">width.</param>
        public ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner(bool allowHTML = false, string key = default(string), string label = default(string), bool sortable = false, string type = default(string), string width = default(string))
        {
            this.AllowHTML = allowHTML;
            this.Key = key;
            this.Label = label;
            this.Sortable = sortable;
            this.Type = type;
            this.Width = width;
        }

        /// <summary>
        /// Whether this column contains HTML
        /// </summary>
        /// <value>Whether this column contains HTML</value>
        [DataMember(Name = "allowHTML", EmitDefaultValue = true)]
        public bool AllowHTML { get; set; }

        /// <summary>
        /// Gets or Sets Key
        /// </summary>
        [DataMember(Name = "key", EmitDefaultValue = false)]
        public string Key { get; set; }

        /// <summary>
        /// Gets or Sets Label
        /// </summary>
        [DataMember(Name = "label", EmitDefaultValue = false)]
        public string Label { get; set; }

        /// <summary>
        /// Whether this column is sortable
        /// </summary>
        /// <value>Whether this column is sortable</value>
        [DataMember(Name = "sortable", EmitDefaultValue = true)]
        public bool Sortable { get; set; }

        /// <summary>
        /// Column type
        /// </summary>
        /// <value>Column type</value>
        [DataMember(Name = "type", EmitDefaultValue = false)]
        public string Type { get; set; }

        /// <summary>
        /// Gets or Sets Width
        /// </summary>
        [DataMember(Name = "width", EmitDefaultValue = false)]
        public string Width { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            StringBuilder sb = new StringBuilder();
            sb.Append("class ModBigbluebuttonbnGetRecordingsToImport200ResponseTabledataColumnsInner {\n");
            sb.Append("  AllowHTML: ").Append(AllowHTML).Append("\n");
            sb.Append("  Key: ").Append(Key).Append("\n");
            sb.Append("  Label: ").Append(Label).Append("\n");
            sb.Append("  Sortable: ").Append(Sortable).Append("\n");
            sb.Append("  Type: ").Append(Type).Append("\n");
            sb.Append("  Width: ").Append(Width).Append("\n");
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
